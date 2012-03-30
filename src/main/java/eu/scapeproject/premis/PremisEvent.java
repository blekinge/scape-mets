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
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Identifier id;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String type;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Date date;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String description;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String shortOutcome;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String longOutcome;
    @XmlElement(name = "agents", namespace = "http://www.loc.gov/standards/premis")
    private List<PremisAgent> agents;
    @XmlElement(name = "entities", namespace = "http://www.loc.gov/standards/premis")
    private List<IntellectualEntity> entities;

    private PremisEvent(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.date = builder.date;
        this.description = builder.description;
        this.shortOutcome = builder.shortOutcome;
        this.longOutcome = builder.longOutcome;
        this.agents = builder.agents;
        this.entities = builder.entities;
    }
    
    private PremisEvent(){
        super();
    }

    public List<PremisAgent> getAgents() {
        return agents;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public List<IntellectualEntity> getEntities() {
        return entities;
    }

    public Identifier getId() {
        return id;
    }

    public String getLongOutcome() {
        return longOutcome;
    }

    public String getShortOutcome() {
        return shortOutcome;
    }

    public String getType() {
        return type;
    }

    public void setAgents(List<PremisAgent> agents) {
        this.agents = agents;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEntities(List<IntellectualEntity> entities) {
        this.entities = entities;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public void setLongOutcome(String longOutcome) {
        this.longOutcome = longOutcome;
    }

    public void setShortOutcome(String shortOutcome) {
        this.shortOutcome = shortOutcome;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        private Identifier id;
        private String type;
        private Date date;
        private String description;
        private String shortOutcome;
        private String longOutcome;
        private List<PremisAgent> agents;
        private List<IntellectualEntity> entities;

        public Builder agents(List<PremisAgent> agents) {
            this.agents = agents;
            return this;
        }

        public PremisEvent build() {
            return new PremisEvent(this);
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder entities(List<IntellectualEntity> entities) {
            this.entities = entities;
            return this;
        }

        public Builder id(Identifier id) {
            this.id = id;
            return this;
        }

        public Builder longOutcome(String longOutcome) {
            this.longOutcome = longOutcome;
            return this;
        }

        public Builder shortOutcome(String shortOutcome) {
            this.shortOutcome = shortOutcome;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }
    }
}
