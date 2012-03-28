package eu.scapeproject.mets;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import eu.scapeproject.jaxb.MetsNamespacePrefixMapper;
import eu.scapeproject.mets.test.TestUtil;
import eu.scapeproject.model.BitStream;
import eu.scapeproject.model.Content;
import eu.scapeproject.model.IntellectualEntity;
import eu.scapeproject.model.Representation;
import eu.scapeproject.model.UUIDIdentifier;

import static org.junit.Assert.*;

public class MetsDocumentTest {

    @Test
    public void testCreateDocument() {
        IntellectualEntity e = TestUtil.createRandomEntity();
        assertNotNull(e);
        assertNotNull(e.getRepresentations());
        for (Representation r : e.getRepresentations()) {
            assertNotNull(r.getId());
            for (Content c : r.getContents()) {
                assertNotNull(c);
                for (BitStream bs : c.getBitStreams()) {
                    assertNotNull(bs);
                }
            }
        }
    }

    @Test
    public void testMetsDocument() {
        IntellectualEntity e = TestUtil.createRandomEntity();
        MetsDocument doc = new MetsDocument.Builder(e).build();
        assertNotNull(doc);
        assertNotNull(doc.getAdmSec());
        for (MetsDigiProvMD d : doc.getAdmSec().getDigiProvMD()) {
            assertNotNull(d.getId());
        }
        for (MetsRightsMD d : doc.getAdmSec().getRightsMD()) {
            assertNotNull(d.getId());
        }
        for (MetsSourceMD d : doc.getAdmSec().getSourceMD()) {
            assertNotNull(d.getId());
        }
        for (MetsTechMD d : doc.getAdmSec().getTechMD()) {
            assertNotNull(d.getId());
        }
        assertNotNull(doc.getDmdSec().getId());
        assertNotNull(doc.getFileGrp());
        for (MetsFileGrp grp : doc.getFileGrp()) {
            assertNotNull(grp.getId());
            for (MetsFile f : grp.getFiles()) {
                assertNotNull(f.getId());
                assertNotNull(f.getUri());
            }
        }
        assertNotNull(doc.getStructMap());
        for (MetsFileDiv d : doc.getStructMap()) {
            assertNotNull(d.getFileId());
            assertNotNull(d.getLabel());
            assertNotNull(d.getType());
        }
    }

    @Test
    public void testSerialization() throws Exception {
        IntellectualEntity e = TestUtil.createRandomEntity();
        MetsDocument doc = new MetsDocument.Builder(e).build();
        Marshaller metsMarshaller = JAXBContext.newInstance(MetsDocument.class, MetsDigiProvMD.class, MetsFile.class, MetsFileDiv.class, MetsFileGrp.class,
                MetsRightsMD.class, MetsSourceMD.class, MetsTechMD.class, MetsADM.class, MetsDMD.class).createMarshaller();
        metsMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        metsMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new MetsNamespacePrefixMapper());
        metsMarshaller.marshal(doc, System.out);
    }

}
