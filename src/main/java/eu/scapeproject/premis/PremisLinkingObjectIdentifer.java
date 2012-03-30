package eu.scapeproject.premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.model.Identifier;

@XmlRootElement(name = "linkingObjectIdentifier", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisLinkingObjectIdentifer {
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Identifier objectIdentifier;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private String linkingObjectRole;

    public Identifier getObjectIdentifier() {
        return objectIdentifier;
    }

    public void setObjectIdentifier(Identifier objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    public String getLinkingObjectRole() {
        return linkingObjectRole;
    }

    public void setLinkingObjectRole(String linkingObjectRole) {
        this.linkingObjectRole = linkingObjectRole;
    }

}
