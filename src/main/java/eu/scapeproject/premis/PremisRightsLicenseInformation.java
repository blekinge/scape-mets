package eu.scapeproject.premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.model.Identifier;

@XmlRootElement(name = "licenseInformation", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsLicenseInformation {
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Identifier licenseIdentifier;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String licenseTerms;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String licenseNote;

    private PremisRightsLicenseInformation(Builder builder) {
        this.licenseIdentifier = builder.licenseIdentifier;
        this.licenseTerms = builder.licenseTerms;
        this.licenseNote = builder.licenseNote;
    }
    
    private PremisRightsLicenseInformation(){
        super();
    }

    public Identifier getLicenseIdentifier() {
        return licenseIdentifier;
    }

    public String getLicenseNote() {
        return licenseNote;
    }

    public String getLicenseTerms() {
        return licenseTerms;
    }

    public void setLicenseIdentifier(Identifier licenseIdentifier) {
        this.licenseIdentifier = licenseIdentifier;
    }

    public void setLicenseNote(String licenseNote) {
        this.licenseNote = licenseNote;
    }

    public void setLicenseTerms(String licenseTerms) {
        this.licenseTerms = licenseTerms;
    }

    public static class Builder {
        private Identifier licenseIdentifier;
        private String licenseTerms;
        private String licenseNote;

        public PremisRightsLicenseInformation build() {
            return new PremisRightsLicenseInformation(this);
        }

        public Builder licenseIdentifier(Identifier licenseIdentifier) {
            this.licenseIdentifier = licenseIdentifier;
            return this;
        }

        public Builder licenseNote(String licenseNote) {
            this.licenseNote = licenseNote;
            return this;
        }

        public Builder licenseTerms(String licenseTerms) {
            this.licenseTerms = licenseTerms;
            return this;
        }
    }
}
