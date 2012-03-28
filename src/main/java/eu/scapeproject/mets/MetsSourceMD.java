package eu.scapeproject.mets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="sourceMD",namespace="mets")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsSourceMD{
    private String id;
    public MetsSourceMD(String id) {
        this.id=id;
    }
    private MetsSourceMD(){
        
    }
    public String getId() {
        return id;
    }
    
}
