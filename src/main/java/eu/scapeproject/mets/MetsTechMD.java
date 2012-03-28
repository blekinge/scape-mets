package eu.scapeproject.mets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="techMD",namespace="mets")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsTechMD {
    private String id;

    public MetsTechMD(String id) {
        super();
        this.id = id;
    }

    private MetsTechMD(){
        super();
    }
    
    public String getId() {
        return id;
    }

}
