package eu.scapeproject.mets;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import eu.scapeproject.model.Content;
import eu.scapeproject.model.IntellectualEntity;
import eu.scapeproject.model.Representation;

@XmlRootElement(name = "mets", namespace = "http://www.loc.gov/METS/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://www.loc.gov/METS/")
public class MetsDocument {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat();
    @XmlElement(namespace="http://www.loc.gov/METS/")
    private MetsADM admSec;
    @XmlElement(namespace="http://www.loc.gov/METS/")
    private MetsDMD dmdSec;
    @XmlElement(namespace="http://www.loc.gov/METS/")
    private Set<MetsFileGrp> fileGrp;
    @XmlElementWrapper(name="structMap",namespace="http://www.loc.gov/METS/")
    @XmlElement(name="div",namespace="http://www.loc.gov/METS/")
    private Set<MetsFileDiv> structMap;

    private MetsDocument() {

    }

    private MetsDocument(Builder b) {
        this.admSec = b.admSec;
        this.dmdSec = b.dmdSec;
        this.fileGrp = b.fileGrp;
        this.structMap = b.structMap;
    }

    public MetsADM getAdmSec() {
        return admSec;
    }

    public MetsDMD getDmdSec() {
        return dmdSec;
    }

    public Set<MetsFileGrp> getFileGrp() {
        return fileGrp;
    }

    public Set<MetsFileDiv> getStructMap() {
        return structMap;
    }

    public static class Builder {
        private MetsADM admSec;
        private MetsDMD dmdSec;
        private Set<MetsFileGrp> fileGrp;
        private Set<MetsFileDiv> structMap;
        private final IntellectualEntity entity;

        public Builder(IntellectualEntity e) {
            this.entity = e;
        }

        public MetsDocument build() {
            this.admSec = new MetsADM();
            this.dmdSec = new MetsDMD(entity.getId().getValue());
            this.dmdSec.setDc(entity.getDescriptive());
            MetsDigiProvMD digiProvMD = new MetsDigiProvMD(entity.getId().getValue());
            this.fileGrp = new HashSet<MetsFileGrp>();
            this.structMap = new HashSet<MetsFileDiv>();
            for (Representation rep : entity.getRepresentations()) {
                MetsFileGrp fileGroup = new MetsFileGrp(rep.getId().getValue());
                digiProvMD.getProvenance().addAll(rep.getProvenance());
                this.admSec.getRightsMD().addAll(rep.getAdministrative().getRightsMD());
                this.admSec.getSourceMD().addAll(rep.getAdministrative().getSourceMD());
                this.admSec.getTechMD().addAll(rep.getAdministrative().getTechMD());
                for (Content content : rep.getContents()) {
                    fileGroup.addFile(new MetsFile(content.getId().getValue(), content.getUri()));
                    this.structMap.add(new MetsFileDiv(content.getMimeType(), content.getLabel(),content.getId().getValue()));
                }
                this.fileGrp.add(fileGroup);
            }
            this.admSec.addDigiProvMD(digiProvMD);
            return new MetsDocument(this);
        }
    }
}
