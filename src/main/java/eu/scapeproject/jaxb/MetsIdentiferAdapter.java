package eu.scapeproject.jaxb;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import eu.scapeproject.model.Identifier;
import eu.scapeproject.model.UUIDIdentifier;

public class MetsIdentiferAdapter extends XmlAdapter<MetsIdentiferAdapter.MetsIdentifier, Identifier> {
    @Override
    public MetsIdentifier marshal(Identifier v) throws Exception {
        MetsIdentifier id=new MetsIdentifier();
        id.type=v.getType();
        id.value=v.getValue();
        return id;
    }
    
    @Override
    public Identifier unmarshal(MetsIdentifier v) throws Exception {
        return new UUIDIdentifier(v.value);
    }
    public static class MetsIdentifier{
        public String type;
        public String value;
    }
}
