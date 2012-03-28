package eu.scapeproject.mets.test;

import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import eu.scapeproject.mets.DCMetadata;
import eu.scapeproject.model.BitStream;
import eu.scapeproject.model.Content;
import eu.scapeproject.model.IntellectualEntity;
import eu.scapeproject.model.Representation;
import eu.scapeproject.model.UUIDIdentifier;
import eu.scapeproject.model.premis.PremisAgent;
import eu.scapeproject.model.premis.PremisEvent;

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
        return r;
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
