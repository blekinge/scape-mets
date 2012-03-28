package eu.scapeproject.jaxb;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import eu.scapeproject.mets.MetadataType;

public class MetadataAdapter extends XmlAdapter<String, Map<MetadataType, String>> {
    @Override
    public String marshal(Map<MetadataType, String> map) throws Exception {
        StringBuilder builder=new StringBuilder();
        builder.append("<map>");
        for (Entry<MetadataType, String> entry:map.entrySet()){
            builder.append("<entry>");
            builder.append("<key>").append(entry.getKey().name()).append("</key>");
            builder.append("<value>").append(entry.getValue()).append("</value>");
            builder.append("</entry>");
        }
        builder.append("</map>");
        return builder.toString();
    }
    @Override
    public Map<MetadataType, String> unmarshal(String v) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}
