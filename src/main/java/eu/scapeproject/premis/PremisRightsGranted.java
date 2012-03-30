package eu.scapeproject.premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rightsGranted",namespace="http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsGranted {
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String act;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String restriction;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private PremisRightsTermOfGrant termOfGrant;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String rightsGrantedNote;

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    public PremisRightsTermOfGrant getTermOfGrant() {
        return termOfGrant;
    }

    public void setTermOfGrant(PremisRightsTermOfGrant termOfGrant) {
        this.termOfGrant = termOfGrant;
    }

    public String getRightsGrantedNote() {
        return rightsGrantedNote;
    }

    public void setRightsGrantedNote(String rightsGrantedNote) {
        this.rightsGrantedNote = rightsGrantedNote;
    }

}
