package eu.scapeproject.mets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.scapeproject.jaxb.MetsFilePtrAdapter;

@XmlRootElement(name = "div", namespace = "http://www.loc.gov/METS/")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsFileDiv {
    @XmlAttribute(name = "type")
    private String type;
    @XmlAttribute(name = "label")
    private String label;
    @XmlJavaTypeAdapter(MetsFilePtrAdapter.class)
    @XmlElement(name="filePtr")
    private String fileId;

    private MetsFileDiv() {
        super();
    }

    public MetsFileDiv(String type, String label, String fileId) {
        super();
        this.type = type;
        this.label = label;
        this.fileId = fileId;
    }

    public String getFileId() {
        return fileId;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setType(String type) {
        this.type = type;
    }

}
