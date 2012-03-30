package eu.scapeproject.mets;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="admSec",namespace="http://www.loc.gov/METS/")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsADM {
    @XmlElement(namespace="http://www.loc.gov/METS/")
    private final List<MetsTechMD> techMD = new ArrayList<MetsTechMD>();
    @XmlElement(namespace="http://www.loc.gov/METS/")
    private final List<MetsSourceMD> sourceMD = new ArrayList<MetsSourceMD>();
    @XmlElement(namespace="http://www.loc.gov/METS/")
    private final List<MetsDigiProvMD> digiProvMD = new ArrayList<MetsDigiProvMD>();
    @XmlElement(namespace="http://www.loc.gov/METS/")
    private final List<MetsRightsMD> rightsMD = new ArrayList<MetsRightsMD>();
    
    public MetsADM(){
        
    }
    
    public List<MetsTechMD> getTechMD() {
        return techMD;
    }

    public void addTechMD(MetsTechMD techMD) {
        this.techMD.add(techMD);
    }

    public List<MetsSourceMD> getSourceMD() {
        return sourceMD;
    }

    public void addSourceMD(MetsSourceMD sourceMD) {
        this.sourceMD.add(sourceMD);
    }

    public List<MetsDigiProvMD> getDigiProvMD() {
        return digiProvMD;
    }

    public void addDigiProvMD(MetsDigiProvMD digiProvMD) {
        this.digiProvMD.add(digiProvMD);
    }

    public List<MetsRightsMD> getRightsMD() {
        return rightsMD;
    }

    public void addRightsMD(MetsRightsMD rightsMD) {
        this.rightsMD.add(rightsMD);
    }
}
