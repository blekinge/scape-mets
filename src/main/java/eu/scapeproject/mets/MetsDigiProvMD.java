package eu.scapeproject.mets;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.model.premis.PremisEvent;

@XmlRootElement(name = "digiProvMD", namespace = "mets")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsDigiProvMD {
    private String id;
    private List<PremisEvent> provenance=new LinkedList<PremisEvent>();

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

    public List<PremisEvent> getProvenance() {
        return provenance;
    }

    public void setProvenance(List<PremisEvent> provenance) {
        this.provenance = provenance;
    }

    public void setId(String id) {
        this.id = id;
    }

}
