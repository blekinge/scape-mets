package eu.scapeproject.mets;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="fileGrp",namespace="mets")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsFileGrp {
    private String id;
    private Set<MetsFile> files=new HashSet<MetsFile>();

    private MetsFileGrp(){
        super();
    }
    
    public MetsFileGrp(String id) {
        super();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<MetsFile> getFiles() {
        return files;
    }

    public void setFiles(Set<MetsFile> files) {
        this.files = files;
    }

    public void addFile(MetsFile file){
        this.files.add(file);
    }
}
