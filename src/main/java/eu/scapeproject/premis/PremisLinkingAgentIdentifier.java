package eu.scapeproject.premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.model.Identifier;

@XmlRootElement(name = "linkingAgentIdentifier", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisLinkingAgentIdentifier {
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Identifier linkingAgentIdentifier;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String linkingAgentRole;

    private PremisLinkingAgentIdentifier(Builder builder) {
        this.linkingAgentIdentifier = builder.linkingAgentIdentifier;
        this.linkingAgentRole = builder.linkingAgentRole;
    }

    private PremisLinkingAgentIdentifier() {
        super();
    }

    public Identifier getLinkingAgentIdentifier() {
        return linkingAgentIdentifier;
    }

    public String getLinkingAgentRole() {
        return linkingAgentRole;
    }

    public void setLinkingAgentIdentifier(Identifier linkingAgentIdentifier) {
        this.linkingAgentIdentifier = linkingAgentIdentifier;
    }

    public void setLinkingAgentRole(String linkingAgentRole) {
        this.linkingAgentRole = linkingAgentRole;
    }

    public static class Builder {
        private Identifier linkingAgentIdentifier;
        private String linkingAgentRole;

        public PremisLinkingAgentIdentifier build() {
            return new PremisLinkingAgentIdentifier(this);
        }

        public Builder linkingAgentIdentifier(Identifier linkingAgentIdentifier) {
            this.linkingAgentIdentifier = linkingAgentIdentifier;
            return this;
        }

        public Builder linkingAgentRole(String linkingAgentRole) {
            this.linkingAgentRole = linkingAgentRole;
            return this;
        }
    }
}
