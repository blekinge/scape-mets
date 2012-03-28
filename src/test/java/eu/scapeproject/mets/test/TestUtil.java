package eu.scapeproject.mets.test;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import eu.scapeproject.model.BitStream;
import eu.scapeproject.model.Content;
import eu.scapeproject.model.IntellectualEntity;
import eu.scapeproject.model.Representation;
import eu.scapeproject.model.UUIDIdentifier;

public abstract class TestUtil {
    public static IntellectualEntity createRandomEntity() {
        IntellectualEntity e = new IntellectualEntity();
        e.setId(new UUIDIdentifier());
        e.setRepresentations(createRandomRepresentations());
        return e;
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
        return r;
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
