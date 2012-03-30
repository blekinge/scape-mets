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

    private PremisLinkingObjectIdentifer(Builder builder) {
        this.objectIdentifier = builder.objectIdentifier;
        this.linkingObjectRole = builder.linkingObjectRole;
    }
    
    private PremisLinkingObjectIdentifer(){
        super();
    }

    public String getLinkingObjectRole() {
        return linkingObjectRole;
    }

    public Identifier getObjectIdentifier() {
        return objectIdentifier;
    }

    public void setLinkingObjectRole(String linkingObjectRole) {
        this.linkingObjectRole = linkingObjectRole;
    }

    public void setObjectIdentifier(Identifier objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    public static class Builder {
        private Identifier objectIdentifier;
        private String linkingObjectRole;

        public PremisLinkingObjectIdentifer build() {
            return new PremisLinkingObjectIdentifer(this);
        }

        public Builder linkingObjectRole(String linkingObjectRole) {
            this.linkingObjectRole = linkingObjectRole;
            return this;
        }

        public Builder objectIdentifier(Identifier objectIdentifier) {
            this.objectIdentifier = objectIdentifier;
            return this;
        }
    }
}
