package eu.scapeproject.mets.test;

import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import eu.scapeproject.dc.DCMetadata;
import eu.scapeproject.mets.MetsADM;
import eu.scapeproject.mets.MetsRightsMD;
import eu.scapeproject.mets.MetsSourceMD;
import eu.scapeproject.mets.MetsTechMD;
import eu.scapeproject.model.BitStream;
import eu.scapeproject.model.Content;
import eu.scapeproject.model.IntellectualEntity;
import eu.scapeproject.model.Representation;
import eu.scapeproject.model.UUIDIdentifier;
import eu.scapeproject.premis.PremisAgent;
import eu.scapeproject.premis.PremisEvent;
import eu.scapeproject.premis.PremisLinkingAgentIdentifier;
import eu.scapeproject.premis.PremisLinkingObjectIdentifer;
import eu.scapeproject.premis.PremisRightsCopyright;
import eu.scapeproject.premis.PremisRightsGranted;
import eu.scapeproject.premis.PremisRightsLicenseInformation;
import eu.scapeproject.premis.PremisRightsStatement;
import eu.scapeproject.premis.PremisRightsStatuteInformation;
import eu.scapeproject.premis.PremisRightsTermOfGrant;
import eu.scapeproject.textmd.TextMDMetadata;

public abstract class TestUtil {
    public static IntellectualEntity createRandomEntity() {
        IntellectualEntity e = new IntellectualEntity();
        e.setId(new UUIDIdentifier());
        e.setDescriptive(createRandomDCMetadata());
        e.setRepresentations(createRandomRepresentations());
        return e;
    }

    private static DCMetadata createRandomDCMetadata() {
        return new DCMetadata.Builder()
                .creator("test-creator")
                .description("test-description")
                .format("test-format")
                .subject("test-subject")
                .title("test-title")
                .build();
    }

    public static Set<Representation> createRandomRepresentations() {
        Set<Representation> representations = new HashSet<Representation>();
        representations.add(createRandomRepresentation());
        return representations;
    }

    public static Representation createRandomRepresentation() {
        Representation r = new Representation();
        r.setId(new UUIDIdentifier());
        r.setContents(createRandomContents());
        r.setProvenance(createRandomProvenance());
        r.setAdministrative(createRandomAdministrative(r));
        return r;
    }

    private static MetsADM createRandomAdministrative(Representation r) {
        MetsADM adm = new MetsADM();
        MetsRightsMD rightsMd = new MetsRightsMD(r.getId().getValue());
        rightsMd.addStatement(createRandomPremisRightsStatement());
        adm.addRightsMD(rightsMd);
        adm.addSourceMD(createRandomSourceMD(r));
        adm.addTechMD(createRandomTechMD(r));
        return adm;
    }

    private static MetsTechMD createRandomTechMD(Representation r) {
        TextMDMetadata textMd = new TextMDMetadata(r.getId().getValue());
        textMd.setEncoding("UTF-8");
        textMd.setLanguage("en");
        textMd.setTextNote("a note");
        return textMd;
    }

    private static MetsSourceMD createRandomSourceMD(Representation r) {
        MetsSourceMD sourceMd = new MetsSourceMD(r.getId().getValue());
        sourceMd.setDcRecord(createRandomDCMetadata());
        return sourceMd;
    }

    private static PremisRightsStatement createRandomPremisRightsStatement() {
        PremisRightsTermOfGrant termOfGrant = new PremisRightsTermOfGrant.Builder()
                .startDate(new Date())
                .endDate(new Date())
                .build();

        PremisRightsGranted granted = new PremisRightsGranted.Builder()
                .act("replicate")
                .restriction("none")
                .termOfGrant(termOfGrant)
                .rightsGrantedNote("note")
                .build();

        PremisRightsCopyright copyright = new PremisRightsCopyright.Builder()
                .copyrightJurisdiction("the jurisdiction")
                .copyrightNote("the note")
                .copyrightStatus("granted")
                .copyrightStatusDeterminationDate(new Date())
                .build();

        PremisRightsLicenseInformation license = new PremisRightsLicenseInformation.Builder()
                .licenseIdentifier(new UUIDIdentifier())
                .licenseTerms("the license terms")
                .build();

        PremisRightsStatuteInformation statute = new PremisRightsStatuteInformation.Builder()
                .statuteCitation("the citation")
                .statuteInformationsDeterminationDate(new Date())
                .statuteJurisdiction("the jurisdiction")
                .statuteNote("the note")
                .build();

        PremisLinkingAgentIdentifier agent = new PremisLinkingAgentIdentifier.Builder()
                .linkingAgentIdentifier(new UUIDIdentifier())
                .linkingAgentRole("MANAGER")
                .build();

        PremisLinkingObjectIdentifer object = new PremisLinkingObjectIdentifer.Builder()
                .objectIdentifier(new UUIDIdentifier())
                .linkingObjectRole("PARENT")
                .build();

        return new PremisRightsStatement.Builder()
                .copyrightInformation(copyright)
                .licenseInformation(license)
                .linkingAgentIdentifier(Arrays.asList(agent))
                .linkingObjectIdentifier(Arrays.asList(object))
                .rightsGranted(Arrays.asList(granted))
                .rightsStatementIdentifier(new UUIDIdentifier())
                .statuteInformation(Arrays.asList(statute))
                .rightsBasis(PremisRightsStatement.Basis.COPYRIGHT)
                .build();
    }

    private static List<PremisEvent> createRandomProvenance() {
        List<PremisEvent> provenance = new LinkedList<PremisEvent>();
        PremisAgent agent = new PremisAgent();
        agent.setId(new UUIDIdentifier());
        agent.setId(new UUIDIdentifier());
        agent.setName("test-agent");
        agent.setType("person");
        PremisEvent event1 = new PremisEvent.Builder()
                .id(new UUIDIdentifier())
                .agents(Arrays.asList(agent))
                .date(new Date())
                .description("testevent description")
                .build();
        provenance.add(event1);
        return provenance;
    }

    public static Set<Content> createRandomContents() {
        Set<Content> contents = new HashSet<Content>();
        contents.add(createRandomContent());
        return contents;
    }

    public static Content createRandomContent() {
        Content content = new Content(new UUIDIdentifier(), URI.create("http://example.com/content-1"));
        content.setLabel("random content");
        content.setMimeType("application/xml");
        content.setBitStreams(createRandomBitStreams());
        return content;
    }

    public static Set<BitStream> createRandomBitStreams() {
        Set<BitStream> streams = new HashSet<BitStream>();
        streams.add(createRandomBitStream());
        return streams;
    }

    public static BitStream createRandomBitStream() {
        BitStream bitStream = new BitStream();
        bitStream.setId(new UUIDIdentifier());
        return bitStream;
    }
}
