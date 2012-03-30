package eu.scapeproject.premis;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import eu.scapeproject.model.Identifier;
import eu.scapeproject.model.IntellectualEntity;

@XmlRootElement(name = "event", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisEvent {
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private Identifier id;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String type;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private Date date;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String description;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String shortOutcome;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String longOutcome;
    @XmlElement(name="agents",namespace="http://www.loc.gov/standards/premis")
    private List<PremisAgent> agents;
    @XmlElement(name="entities",namespace="http://www.loc.gov/standards/premis")
    private List<IntellectualEntity> entities;
    
    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortOutcome() {
        return shortOutcome;
    }

    public void setShortOutcome(String shortOutcome) {
        this.shortOutcome = shortOutcome;
    }

    public String getLongOutcome() {
        return longOutcome;
    }

    public void setLongOutcome(String longOutcome) {
        this.longOutcome = longOutcome;
    }

    public List<PremisAgent> getAgents() {
        return agents;
    }

    public void setAgents(List<PremisAgent> agents) {
        this.agents = agents;
    }

    public List<IntellectualEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<IntellectualEntity> entities) {
        this.entities = entities;
    }

}
