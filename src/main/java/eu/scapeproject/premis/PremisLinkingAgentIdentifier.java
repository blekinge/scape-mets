package eu.scapeproject.premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.model.Identifier;

@XmlRootElement(name="linkingAgentIdentifier",namespace="http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisLinkingAgentIdentifier {
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private Identifier linkingAgentIdentifier;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private String linkingAgentRole;

    public Identifier getLinkingAgentIdentifier() {
        return linkingAgentIdentifier;
    }

    public void setLinkingAgentIdentifier(Identifier linkingAgentIdentifier) {
        this.linkingAgentIdentifier = linkingAgentIdentifier;
    }

    public String getLinkingAgentRole() {
        return linkingAgentRole;
    }

    public void setLinkingAgentRole(String linkingAgentRole) {
        this.linkingAgentRole = linkingAgentRole;
    }

}
