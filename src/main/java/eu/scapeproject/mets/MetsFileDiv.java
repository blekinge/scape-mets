package eu.scapeproject.mets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="div",namespace="mets")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsFileDiv {
    private String type;
    private String label;
    private String fileId;

    private MetsFileDiv(){
        super();
    }
    
    public MetsFileDiv(String type, String label, String fileId) {
        super();
        this.type = type;
        this.label = label;
        this.fileId = fileId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
    
    public static class Builder{
        
    }

}
