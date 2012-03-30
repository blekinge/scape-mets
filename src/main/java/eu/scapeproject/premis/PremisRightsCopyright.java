package eu.scapeproject.premis;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "copyrightInformation", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsCopyright {
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String copyrightStatus;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String copyrightJurisdiction;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Date copyrightStatusDeterminationDate;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String copyrightNote;

    private PremisRightsCopyright(Builder builder) {
        this.copyrightStatus = builder.copyrightStatus;
        this.copyrightJurisdiction = builder.copyrightJurisdiction;
        this.copyrightStatusDeterminationDate = builder.copyrightStatusDeterminationDate;
        this.copyrightNote = builder.copyrightNote;
    }
    
    private PremisRightsCopyright(){
        super();
    }

    public String getCopyrightJurisdiction() {
        return copyrightJurisdiction;
    }

    public String getCopyrightNote() {
        return copyrightNote;
    }

    public String getCopyrightStatus() {
        return copyrightStatus;
    }

    public Date getCopyrightStatusDeterminationDate() {
        return copyrightStatusDeterminationDate;
    }

    public void setCopyrightJurisdiction(String copyrightJurisdiction) {
        this.copyrightJurisdiction = copyrightJurisdiction;
    }

    public void setCopyrightNote(String copyrightNote) {
        this.copyrightNote = copyrightNote;
    }

    public void setCopyrightStatus(String copyrightStatus) {
        this.copyrightStatus = copyrightStatus;
    }

    public void setCopyrightStatusDeterminationDate(Date copyrightStatusDeterminationDate) {
        this.copyrightStatusDeterminationDate = copyrightStatusDeterminationDate;
    }

    public static class Builder {
        private String copyrightStatus;
        private String copyrightJurisdiction;
        private Date copyrightStatusDeterminationDate;
        private String copyrightNote;

        public PremisRightsCopyright build() {
            return new PremisRightsCopyright(this);
        }

        public Builder copyrightJurisdiction(String copyrightJurisdiction) {
            this.copyrightJurisdiction = copyrightJurisdiction;
            return this;
        }

        public Builder copyrightNote(String copyrightNote) {
            this.copyrightNote = copyrightNote;
            return this;
        }

        public Builder copyrightStatus(String copyrightStatus) {
            this.copyrightStatus = copyrightStatus;
            return this;
        }

        public Builder copyrightStatusDeterminationDate(Date copyrightStatusDeterminationDate) {
            this.copyrightStatusDeterminationDate = copyrightStatusDeterminationDate;
            return this;
        }
    }
}
