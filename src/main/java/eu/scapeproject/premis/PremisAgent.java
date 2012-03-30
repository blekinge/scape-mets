package eu.scapeproject.premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import eu.scapeproject.model.Identifier;

@XmlRootElement(name="agent",namespace="http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisAgent {
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private Identifier id;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String name;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String type;
    public Identifier getId() {
        return id;
    }
    public void setId(Identifier id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
