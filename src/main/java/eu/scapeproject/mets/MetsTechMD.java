package eu.scapeproject.mets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="techMD",namespace="http://www.loc.gov/METS/")
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class MetsTechMD {
    @XmlElement(namespace="http://www.loc.gov/METS/")
    protected String id;
    @XmlTransient
    protected MetadataType type;
    
    public enum MetadataType{
        TEXTMD,MIX;
    }

    public MetsTechMD(String id,MetadataType type) {
        super();
        this.id = id;
        this.type=type;
    }

    private MetsTechMD(){
        super();
    }
    
    public String getId() {
        return id;
    }

}
