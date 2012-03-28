package eu.scapeproject.mets;

import java.net.URI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="file",namespace="mets")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsFile {
    private String id;
    private URI uri;
    
    private MetsFile(){
        super();
    }

    public MetsFile(String id, URI uri) {
        super();
        this.id = id;
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

}
