package eu.scapeproject.premis;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="copyrightInformation",namespace="http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsCopyright {
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String copyrightStatus;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String copyrightJurisdiction;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private Date copyrightStatusDeterminationDate;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String copyrightNote;

    public String getCopyrightStatus() {
        return copyrightStatus;
    }

    public void setCopyrightStatus(String copyrightStatus) {
        this.copyrightStatus = copyrightStatus;
    }

    public String getCopyrightJurisdiction() {
        return copyrightJurisdiction;
    }

    public void setCopyrightJurisdiction(String copyrightJurisdiction) {
        this.copyrightJurisdiction = copyrightJurisdiction;
    }

    public Date getCopyrightStatusDeterminationDate() {
        return copyrightStatusDeterminationDate;
    }

    public void setCopyrightStatusDeterminationDate(Date copyrightStatusDeterminationDate) {
        this.copyrightStatusDeterminationDate = copyrightStatusDeterminationDate;
    }

    public String getCopyrightNote() {
        return copyrightNote;
    }

    public void setCopyrightNote(String copyrightNote) {
        this.copyrightNote = copyrightNote;
    }

}
