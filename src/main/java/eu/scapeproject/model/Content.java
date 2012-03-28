package eu.scapeproject.model;

import java.net.URI;
import java.util.Set;

public class Content {
    private Identifier id;
    private URI uri;
    private Set<BitStream> bitStreams;
    private String mimeType;
    private String label;

    public Content(Identifier id, URI uri) {
        super();
        this.id = id;
        this.uri = uri;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Set<BitStream> getBitStreams() {
        return bitStreams;
    }

    public Identifier getId() {
        return id;
    }

    public String getMimeType() {
        return mimeType;
    }

    public URI getUri() {
        return uri;
    }

    public void setBitStreams(Set<BitStream> bitStreams) {
        this.bitStreams = bitStreams;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

}
