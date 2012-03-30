package eu.scapeproject.mets;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.dc.DCMetadata;

@XmlRootElement(name = "dmdSec", namespace = "http://www.loc.gov/METS/")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsDMD {
    @XmlElement(name="mdWrap")
    private DCMetadata dc=new DCMetadata();
    private String id;

    public MetsDMD(String id) {
        super();
        this.id = id;
    }

    private MetsDMD() {
        super();
    }

    public String getId() {
        return id;
    }

    public DCMetadata getDc() {
        return dc;
    }

    public void setDc(DCMetadata dc) {
        this.dc = dc;
    }

}
