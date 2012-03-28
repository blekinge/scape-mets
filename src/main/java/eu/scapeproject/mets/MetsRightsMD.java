package eu.scapeproject.mets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rightsMD",namespace="mets")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsRightsMD {
    private String id;

    private MetsRightsMD(){
        super();
    }
    
    public MetsRightsMD(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
}
