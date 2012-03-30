package eu.scapeproject.mets;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.premis.PremisRightsStatement;

@XmlRootElement(name = "rightsMD", namespace = "http://www.loc.gov/METS/")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsRightsMD {
    @XmlElement(namespace = "http://www.loc.gov/METS/")
    private String id;
    @XmlElement(namespace="http://www.loc.gov/standards/premis")
    private List<PremisRightsStatement> rightsStatements=new ArrayList<PremisRightsStatement>();

    private MetsRightsMD() {
        super();
    }

    public MetsRightsMD(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<PremisRightsStatement> getRightsStatements() {
        return rightsStatements;
    }

    public void addStatement(PremisRightsStatement statement) {
        this.rightsStatements.add(statement);
    }

}
