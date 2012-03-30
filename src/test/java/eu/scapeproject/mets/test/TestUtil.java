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
        DCMetadata dc=new DCMetadata();
        dc.setCreator("test-creator");
        dc.setDescription("test-description");
        dc.setFormat("test-format");
        dc.setSubject("test-subject");
        dc.setTitle("test-title");
        return dc;
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
        MetsADM adm=new MetsADM();
        MetsRightsMD rightsMd=new MetsRightsMD(r.getId().getValue());
        rightsMd.addStatement(createRandomPremisRightsStatement());
        adm.addRightsMD(rightsMd);
        adm.addSourceMD(createRandomSourceMD(r));
        adm.addTechMD(createRandomTechMD(r));
        return adm;
    }

    private static MetsTechMD createRandomTechMD(Representation r) {
        TextMDMetadata textMd=new TextMDMetadata(r.getId().getValue());
        textMd.setEncoding("UTF-8");
        textMd.setLanguage("en");
        textMd.setTextNote("a note");
        return textMd;
    }

    private static MetsSourceMD createRandomSourceMD(Representation r) {
        MetsSourceMD sourceMd=new MetsSourceMD(r.getId().getValue());
        sourceMd.setDcRecord(createRandomDCMetadata());
        return sourceMd;
    }

    private static PremisRightsStatement createRandomPremisRightsStatement() {
        PremisRightsTermOfGrant termOfGrant=new PremisRightsTermOfGrant();
        termOfGrant.setStartDate(new Date());
        termOfGrant.setEndDate(new Date());
        
        PremisRightsGranted granted=new PremisRightsGranted();
        granted.setAct("replicate");
        granted.setRestriction("none");
        granted.setTermOfGrant(termOfGrant);
        granted.setRightsGrantedNote("note");
        
        PremisRightsCopyright copyright=new PremisRightsCopyright();
        copyright.setCopyrightJurisdiction("the jurisdiction");
        copyright.setCopyrightNote("the note");
        copyright.setCopyrightStatus("granted");
        copyright.setCopyrightStatusDeterminationDate(new Date());
        
        PremisRightsLicenseInformation license=new PremisRightsLicenseInformation();
        license.setLicenseIdentifier(new UUIDIdentifier());
        license.setLicenseTerms("the license terms");
        
        
        PremisRightsStatuteInformation statute=new PremisRightsStatuteInformation();
        statute.setStatuteCitation("the citation");
        statute.setStatuteInformationsDeterminationDate(new Date());
        statute.setStatuteJurisdiction("the jurisdiction");
        statute.setStatuteNote("the note");
        
        PremisLinkingAgentIdentifier agent=new PremisLinkingAgentIdentifier();
        agent.setLinkingAgentIdentifier(new UUIDIdentifier());
        agent.setLinkingAgentRole("MANAGER");
        
        PremisLinkingObjectIdentifer object=new PremisLinkingObjectIdentifer();
        object.setObjectIdentifier(new UUIDIdentifier());
        object.setLinkingObjectRole("PARENT");
        
        PremisRightsStatement st=new PremisRightsStatement();
        st.setCopyrightInformation(copyright);
        st.setLicenseInformation(license);
        st.setLinkingAgentIdentifier(Arrays.asList(agent));
        st.setLinkingObjectIdentifier(Arrays.asList(object));
        st.setRightsGranted(Arrays.asList(granted));
        st.setRightsStatementIdentifier(new UUIDIdentifier());
        st.setStatuteInformation(Arrays.asList(statute));
        st.setRightsBasis(PremisRightsStatement.Basis.COPYRIGHT);
        return st;
    }
    

    private static List<PremisEvent> createRandomProvenance() {
        List<PremisEvent> provenance=new LinkedList<PremisEvent>();
        PremisEvent event1=new PremisEvent();
        PremisAgent agent=new PremisAgent();
        agent.setId(new UUIDIdentifier());
        agent.setId(new UUIDIdentifier());
        agent.setName("test-agent");
        agent.setType("person");
        event1.setId(new UUIDIdentifier());
        event1.setAgents(Arrays.asList(agent));
        event1.setDate(new Date());
        event1.setDescription("testevent description");
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
