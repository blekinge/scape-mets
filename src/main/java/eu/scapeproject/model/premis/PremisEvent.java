package eu.scapeproject.model.premis;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import eu.scapeproject.model.Identifier;
import eu.scapeproject.model.IntellectualEntity;

@XmlRootElement(name = "event", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://www.loc.gov/standards/premis")
public class PremisEvent {
    private Identifier id;
    private String type;
    private Date date;
    private String description;
    private String shortOutcome;
    private String longOutcome;
    private List<PremisAgent> agents;
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
