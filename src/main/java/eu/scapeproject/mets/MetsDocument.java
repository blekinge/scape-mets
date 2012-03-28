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
    private MetsADM admSec;
    private MetsDMD dmdSec;
    private Set<MetsFileGrp> fileGrp;
    @XmlElementWrapper(name="structMap")
    @XmlElement(name="div")
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
            this.dmdSec.getDc().addRights("test rights 1");
            this.dmdSec.getDc().addRights("test rights 2");
            this.dmdSec.getDc().setTitle("test title");
            this.dmdSec.getDc().addLanguage("german");
            this.dmdSec.getDc().addLanguage("magyar");
            this.dmdSec.getDc().addLanguage("english");
            MetsRightsMD rightsMD = new MetsRightsMD(entity.getId().getValue());
            MetsDigiProvMD digiProvMD = new MetsDigiProvMD(entity.getId().getValue());
            MetsTechMD techMD = new MetsTechMD(entity.getId().getValue());
            MetsSourceMD sourceMD = new MetsSourceMD(entity.getId().getValue());
            this.admSec.addRightsMD(rightsMD);
            this.admSec.addDigiProvMD(digiProvMD);
            this.admSec.addSourceMD(sourceMD);
            this.admSec.addTechMD(techMD);
            this.fileGrp = new HashSet<MetsFileGrp>();
            this.structMap = new HashSet<MetsFileDiv>();
            for (Representation rep : entity.getRepresentations()) {
                MetsFileGrp fileGroup = new MetsFileGrp(rep.getId().getValue());
                for (Content content : rep.getContents()) {
                    fileGroup.addFile(new MetsFile(content.getId().getValue(), content.getUri()));
                    this.structMap.add(new MetsFileDiv(content.getMimeType(), content.getLabel(),content.getId().getValue()));
                }
                this.fileGrp.add(fileGroup);
            }
            return new MetsDocument(this);
        }
    }
}
