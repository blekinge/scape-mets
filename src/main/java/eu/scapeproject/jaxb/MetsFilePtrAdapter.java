package eu.scapeproject.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MetsFilePtrAdapter extends XmlAdapter<MetsFilePtrAdapter.FilePtr, String> {
    @Override
    public FilePtr marshal(String v) throws Exception {
        FilePtr p=new FilePtr();
        p.fileId=v;
        return p;
    }

    @Override
    public String unmarshal(FilePtr v) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @XmlRootElement(name = "filePtr", namespace = "http://www.loc.gov/METS/")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class FilePtr {
        @XmlAttribute(name = "fileId")
        public String fileId;
    }
}
