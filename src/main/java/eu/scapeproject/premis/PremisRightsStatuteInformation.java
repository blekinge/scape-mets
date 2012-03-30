package eu.scapeproject.premis;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="statuteInformation",namespace="http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsStatuteInformation {
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String statuteJurisdiction;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String statuteCitation;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private Date statuteInformationsDeterminationDate;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String statuteNote;

    public String getStatuteJurisdiction() {
        return statuteJurisdiction;
    }

    public void setStatuteJurisdiction(String statuteJurisdiction) {
        this.statuteJurisdiction = statuteJurisdiction;
    }

    public String getStatuteCitation() {
        return statuteCitation;
    }

    public void setStatuteCitation(String statuteCitation) {
        this.statuteCitation = statuteCitation;
    }

    public Date getStatuteInformationsDeterminationDate() {
        return statuteInformationsDeterminationDate;
    }

    public void setStatuteInformationsDeterminationDate(Date statuteInformationsDeterminationDate) {
        this.statuteInformationsDeterminationDate = statuteInformationsDeterminationDate;
    }

    public String getStatuteNote() {
        return statuteNote;
    }

    public void setStatuteNote(String statuteNote) {
        this.statuteNote = statuteNote;
    }

}
