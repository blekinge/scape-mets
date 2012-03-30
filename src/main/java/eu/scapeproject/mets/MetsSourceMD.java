package eu.scapeproject.mets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.dc.DCMetadata;

@XmlRootElement(name = "sourceMD", namespace = "http://www.loc.gov/METS/")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsSourceMD {
    @XmlElement(namespace="http://www.loc.gov/METS/")
    private String id;
    @XmlElement(name="mdWrap",namespace="http://www.loc.gov/METS/")
    private DCMetadata dcRecord;

    public MetsSourceMD(String id) {
        this.id = id;
    }

    private MetsSourceMD() {

    }

    public String getId() {
        return id;
    }

    public DCMetadata getDcRecord() {
        return dcRecord;
    }

    public void setDcRecord(DCMetadata dcRecord) {
        this.dcRecord = dcRecord;
    }

}
