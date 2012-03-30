package eu.scapeproject.premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rightsGranted", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsGranted {
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String act;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String restriction;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private PremisRightsTermOfGrant termOfGrant;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String rightsGrantedNote;

    private PremisRightsGranted(Builder builder) {
        this.act = builder.act;
        this.restriction = builder.restriction;
        this.termOfGrant = builder.termOfGrant;
        this.rightsGrantedNote = builder.rightsGrantedNote;
    }
    
    private PremisRightsGranted(){
        super();
    }

    public String getAct() {
        return act;
    }

    public String getRestriction() {
        return restriction;
    }

    public String getRightsGrantedNote() {
        return rightsGrantedNote;
    }

    public PremisRightsTermOfGrant getTermOfGrant() {
        return termOfGrant;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    public void setRightsGrantedNote(String rightsGrantedNote) {
        this.rightsGrantedNote = rightsGrantedNote;
    }

    public void setTermOfGrant(PremisRightsTermOfGrant termOfGrant) {
        this.termOfGrant = termOfGrant;
    }

    public static class Builder {
        private String act;
        private String restriction;
        private PremisRightsTermOfGrant termOfGrant;
        private String rightsGrantedNote;

        public Builder act(String act) {
            this.act = act;
            return this;
        }

        public PremisRightsGranted build() {
            return new PremisRightsGranted(this);
        }

        public Builder restriction(String restriction) {
            this.restriction = restriction;
            return this;
        }

        public Builder rightsGrantedNote(String rightsGrantedNote) {
            this.rightsGrantedNote = rightsGrantedNote;
            return this;
        }

        public Builder termOfGrant(PremisRightsTermOfGrant termOfGrant) {
            this.termOfGrant = termOfGrant;
            return this;
        }
    }
}
