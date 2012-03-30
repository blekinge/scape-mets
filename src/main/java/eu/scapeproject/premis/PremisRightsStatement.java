package eu.scapeproject.premis;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.model.Identifier;

@XmlRootElement(name="rightsStatement",namespace="http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsStatement {
    public enum Basis {
        COPYRIGHT, LICENSE, STATUTE;
    }

    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private Identifier rightsStatementIdentifier;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private Basis rightsBasis;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private PremisRightsCopyright copyrightInformation;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private PremisRightsLicenseInformation licenseInformation;
    @XmlElement(name="statuteInformation",namespace="http://www.loc.gov/standards/premis")
    private List<PremisRightsStatuteInformation> statuteInformation;
    @XmlElement(name="rightsGranted",namespace="http://www.loc.gov/standards/premis")
    private List<PremisRightsGranted> rightsGranted;
    @XmlElement(name="linkingObjectIdentifier",namespace="http://www.loc.gov/standards/premis")
    private List<PremisLinkingObjectIdentifer> linkingObjectIdentifier;
    @XmlElement(name="linkingAgentIfentifier",namespace="http://www.loc.gov/standards/premis")
    private List<PremisLinkingAgentIdentifier> linkingAgentIdentifier;
    @XmlElement(name="rightsExtension",namespace="http://www.loc.gov/standards/premis")
    private String rightsExtensions;

    public Identifier getRightsStatementIdentifier() {
        return rightsStatementIdentifier;
    }

    public void setRightsStatementIdentifier(Identifier rightsStatementIdentifier) {
        this.rightsStatementIdentifier = rightsStatementIdentifier;
    }

    public Basis getRightsBasis() {
        return rightsBasis;
    }

    public void setRightsBasis(Basis rightsBasis) {
        this.rightsBasis = rightsBasis;
    }

    public PremisRightsCopyright getCopyrightInformation() {
        return copyrightInformation;
    }

    public void setCopyrightInformation(PremisRightsCopyright copyrightInformation) {
        this.copyrightInformation = copyrightInformation;
    }

    public PremisRightsLicenseInformation getLicenseInformation() {
        return licenseInformation;
    }

    public void setLicenseInformation(PremisRightsLicenseInformation licenseInformation) {
        this.licenseInformation = licenseInformation;
    }

    public List<PremisRightsStatuteInformation> getStatuteInformation() {
        return statuteInformation;
    }

    public void setStatuteInformation(List<PremisRightsStatuteInformation> statuteInformation) {
        this.statuteInformation = statuteInformation;
    }

    public List<PremisRightsGranted> getRightsGranted() {
        return rightsGranted;
    }

    public void setRightsGranted(List<PremisRightsGranted> rightsGranted) {
        this.rightsGranted = rightsGranted;
    }

    public List<PremisLinkingObjectIdentifer> getLinkingObjectIdentifier() {
        return linkingObjectIdentifier;
    }

    public void setLinkingObjectIdentifier(List<PremisLinkingObjectIdentifer> linkingObjectIdentifier) {
        this.linkingObjectIdentifier = linkingObjectIdentifier;
    }

    public List<PremisLinkingAgentIdentifier> getLinkingAgentIdentifier() {
        return linkingAgentIdentifier;
    }

    public void setLinkingAgentIdentifier(List<PremisLinkingAgentIdentifier> linkingAgentIdentifier) {
        this.linkingAgentIdentifier = linkingAgentIdentifier;
    }

    public String getRightsExtensions() {
        return rightsExtensions;
    }

    public void setRightsExtensions(String rightsExtensions) {
        this.rightsExtensions = rightsExtensions;
    }

}
