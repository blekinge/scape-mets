package eu.scapeproject.jaxb;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class MetsNamespacePrefixMapper extends NamespacePrefixMapper {
    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        if (namespaceUri.toLowerCase().equals("http://www.loc.gov/mets/")){
            return "mets";
        }else if(namespaceUri.toLowerCase().equals("http://purl.org/dc/elements/1.1/")){
            return "dc";
        }else{
            return suggestion;
        }
    }
}
