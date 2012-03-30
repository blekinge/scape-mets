package eu.scapeproject.premis;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.model.Identifier;

@XmlRootElement(name = "rightsStatement", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsStatement {
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Identifier rightsStatementIdentifier;

    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Basis rightsBasis;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private PremisRightsCopyright copyrightInformation;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private PremisRightsLicenseInformation licenseInformation;
    @XmlElement(name = "statuteInformation", namespace = "http://www.loc.gov/standards/premis")
    private List<PremisRightsStatuteInformation> statuteInformation;
    @XmlElement(name = "rightsGranted", namespace = "http://www.loc.gov/standards/premis")
    private List<PremisRightsGranted> rightsGranted;
    @XmlElement(name = "linkingObjectIdentifier", namespace = "http://www.loc.gov/standards/premis")
    private List<PremisLinkingObjectIdentifer> linkingObjectIdentifier;
    @XmlElement(name = "linkingAgentIfentifier", namespace = "http://www.loc.gov/standards/premis")
    private List<PremisLinkingAgentIdentifier> linkingAgentIdentifier;
    @XmlElement(name = "rightsExtension", namespace = "http://www.loc.gov/standards/premis")
    private String rightsExtensions;

    private PremisRightsStatement(Builder builder) {
        this.rightsStatementIdentifier = builder.rightsStatementIdentifier;
        this.rightsBasis = builder.rightsBasis;
        this.copyrightInformation = builder.copyrightInformation;
        this.licenseInformation = builder.licenseInformation;
        this.statuteInformation = builder.statuteInformation;
        this.rightsGranted = builder.rightsGranted;
        this.linkingObjectIdentifier = builder.linkingObjectIdentifier;
        this.linkingAgentIdentifier = builder.linkingAgentIdentifier;
        this.rightsExtensions = builder.rightsExtensions;
    }
    
    private PremisRightsStatement(){
        super();
    }

    public PremisRightsCopyright getCopyrightInformation() {
        return copyrightInformation;
    }

    public PremisRightsLicenseInformation getLicenseInformation() {
        return licenseInformation;
    }

    public List<PremisLinkingAgentIdentifier> getLinkingAgentIdentifier() {
        return linkingAgentIdentifier;
    }

    public List<PremisLinkingObjectIdentifer> getLinkingObjectIdentifier() {
        return linkingObjectIdentifier;
    }

    public Basis getRightsBasis() {
        return rightsBasis;
    }

    public String getRightsExtensions() {
        return rightsExtensions;
    }

    public List<PremisRightsGranted> getRightsGranted() {
        return rightsGranted;
    }

    public Identifier getRightsStatementIdentifier() {
        return rightsStatementIdentifier;
    }

    public List<PremisRightsStatuteInformation> getStatuteInformation() {
        return statuteInformation;
    }

    public void setCopyrightInformation(PremisRightsCopyright copyrightInformation) {
        this.copyrightInformation = copyrightInformation;
    }

    public void setLicenseInformation(PremisRightsLicenseInformation licenseInformation) {
        this.licenseInformation = licenseInformation;
    }

    public void setLinkingAgentIdentifier(List<PremisLinkingAgentIdentifier> linkingAgentIdentifier) {
        this.linkingAgentIdentifier = linkingAgentIdentifier;
    }

    public void setLinkingObjectIdentifier(List<PremisLinkingObjectIdentifer> linkingObjectIdentifier) {
        this.linkingObjectIdentifier = linkingObjectIdentifier;
    }

    public void setRightsBasis(Basis rightsBasis) {
        this.rightsBasis = rightsBasis;
    }

    public void setRightsExtensions(String rightsExtensions) {
        this.rightsExtensions = rightsExtensions;
    }

    public void setRightsGranted(List<PremisRightsGranted> rightsGranted) {
        this.rightsGranted = rightsGranted;
    }

    public void setRightsStatementIdentifier(Identifier rightsStatementIdentifier) {
        this.rightsStatementIdentifier = rightsStatementIdentifier;
    }

    public void setStatuteInformation(List<PremisRightsStatuteInformation> statuteInformation) {
        this.statuteInformation = statuteInformation;
    }

    public enum Basis {
        COPYRIGHT, LICENSE, STATUTE;
    }

    public static class Builder {
        private Identifier rightsStatementIdentifier;
        private Basis rightsBasis;
        private PremisRightsCopyright copyrightInformation;
        private PremisRightsLicenseInformation licenseInformation;
        private List<PremisRightsStatuteInformation> statuteInformation;
        private List<PremisRightsGranted> rightsGranted;
        private List<PremisLinkingObjectIdentifer> linkingObjectIdentifier;
        private List<PremisLinkingAgentIdentifier> linkingAgentIdentifier;
        private String rightsExtensions;

        public PremisRightsStatement build() {
            return new PremisRightsStatement(this);
        }

        public Builder copyrightInformation(PremisRightsCopyright copyrightInformation) {
            this.copyrightInformation = copyrightInformation;
            return this;
        }

        public Builder licenseInformation(PremisRightsLicenseInformation licenseInformation) {
            this.licenseInformation = licenseInformation;
            return this;
        }

        public Builder linkingAgentIdentifier(List<PremisLinkingAgentIdentifier> linkingAgentIdentifier) {
            this.linkingAgentIdentifier = linkingAgentIdentifier;
            return this;
        }

        public Builder linkingObjectIdentifier(List<PremisLinkingObjectIdentifer> linkingObjectIdentifier) {
            this.linkingObjectIdentifier = linkingObjectIdentifier;
            return this;
        }

        public Builder rightsBasis(Basis rightsBasis) {
            this.rightsBasis = rightsBasis;
            return this;
        }

        public Builder rightsExtensions(String rightsExtensions) {
            this.rightsExtensions = rightsExtensions;
            return this;
        }

        public Builder rightsGranted(List<PremisRightsGranted> rightsGranted) {
            this.rightsGranted = rightsGranted;
            return this;
        }

        public Builder rightsStatementIdentifier(Identifier rightsStatementIdentifier) {
            this.rightsStatementIdentifier = rightsStatementIdentifier;
            return this;
        }

        public Builder statuteInformation(List<PremisRightsStatuteInformation> statuteInformation) {
            this.statuteInformation = statuteInformation;
            return this;
        }
    }
}
