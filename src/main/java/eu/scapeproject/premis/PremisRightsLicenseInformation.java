package eu.scapeproject.premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.model.Identifier;

@XmlRootElement(name="licenseInformation",namespace="http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsLicenseInformation {
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private Identifier licenseIdentifier;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String licenseTerms;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String licenseNote;

    public Identifier getLicenseIdentifier() {
        return licenseIdentifier;
    }

    public void setLicenseIdentifier(Identifier licenseIdentifier) {
        this.licenseIdentifier = licenseIdentifier;
    }

    public String getLicenseTerms() {
        return licenseTerms;
    }

    public void setLicenseTerms(String licenseTerms) {
        this.licenseTerms = licenseTerms;
    }

    public String getLicenseNote() {
        return licenseNote;
    }

    public void setLicenseNote(String licenseNote) {
        this.licenseNote = licenseNote;
    }

}
