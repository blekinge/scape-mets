package eu.scapeproject.model;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.scapeproject.jaxb.MetsIdentiferAdapter;

@XmlJavaTypeAdapter(value=MetsIdentiferAdapter.class)
public interface Identifier {
    public String getValue();
    public String getType();
}
