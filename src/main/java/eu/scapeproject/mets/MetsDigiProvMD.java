package eu.scapeproject.mets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "digiProvMD", namespace = "mets")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsDigiProvMD {
    private String id;

    private MetsDigiProvMD() {
        super();
    }

    public MetsDigiProvMD(String id) {
        super();
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
