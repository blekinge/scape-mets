package eu.scapeproject.premis;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "statuteInformation", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsStatuteInformation {
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String statuteJurisdiction;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String statuteCitation;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Date statuteInformationsDeterminationDate;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String statuteNote;

    private PremisRightsStatuteInformation(Builder builder) {
        this.statuteJurisdiction = builder.statuteJurisdiction;
        this.statuteCitation = builder.statuteCitation;
        this.statuteInformationsDeterminationDate = builder.statuteInformationsDeterminationDate;
        this.statuteNote = builder.statuteNote;
    }
    
    private PremisRightsStatuteInformation(){
        super();
    }

    public String getStatuteCitation() {
        return statuteCitation;
    }

    public Date getStatuteInformationsDeterminationDate() {
        return statuteInformationsDeterminationDate;
    }

    public String getStatuteJurisdiction() {
        return statuteJurisdiction;
    }

    public String getStatuteNote() {
        return statuteNote;
    }

    public void setStatuteCitation(String statuteCitation) {
        this.statuteCitation = statuteCitation;
    }

    public void setStatuteInformationsDeterminationDate(Date statuteInformationsDeterminationDate) {
        this.statuteInformationsDeterminationDate = statuteInformationsDeterminationDate;
    }

    public void setStatuteJurisdiction(String statuteJurisdiction) {
        this.statuteJurisdiction = statuteJurisdiction;
    }

    public void setStatuteNote(String statuteNote) {
        this.statuteNote = statuteNote;
    }

    public static class Builder {
        private String statuteJurisdiction;
        private String statuteCitation;
        private Date statuteInformationsDeterminationDate;
        private String statuteNote;

        public PremisRightsStatuteInformation build() {
            return new PremisRightsStatuteInformation(this);
        }

        public Builder statuteCitation(String statuteCitation) {
            this.statuteCitation = statuteCitation;
            return this;
        }

        public Builder statuteInformationsDeterminationDate(Date statuteInformationsDeterminationDate) {
            this.statuteInformationsDeterminationDate = statuteInformationsDeterminationDate;
            return this;
        }

        public Builder statuteJurisdiction(String statuteJurisdiction) {
            this.statuteJurisdiction = statuteJurisdiction;
            return this;
        }

        public Builder statuteNote(String statuteNote) {
            this.statuteNote = statuteNote;
            return this;
        }
    }
}
