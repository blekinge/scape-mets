package eu.scapeproject.premis;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "termOfGrant", namespace = "http://www.loc.gov/standards/premis")
@XmlAccessorType(XmlAccessType.FIELD)
public class PremisRightsTermOfGrant {
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Date startDate;
    @XmlElement(namespace = "http://www.loc.gov/standards/premis")
    private Date endDate;

    private PremisRightsTermOfGrant(Builder builder) {
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }

    private PremisRightsTermOfGrant() {
        super();
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public static class Builder {
        private Date startDate;
        private Date endDate;

        public PremisRightsTermOfGrant build() {
            return new PremisRightsTermOfGrant(this);
        }

        public Builder endDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder startDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }
    }
}
