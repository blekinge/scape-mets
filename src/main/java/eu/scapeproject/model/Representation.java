package eu.scapeproject.model;

import java.util.List;
import java.util.Set;

import eu.scapeproject.mets.MetsADM;
import eu.scapeproject.premis.PremisEvent;

public class Representation {
    private Identifier id;
    private Set<Content> contents;
    private List<PremisEvent> provenance;
    private MetsADM administrative;

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    public List<PremisEvent> getProvenance() {
        return provenance;
    }

    public void setProvenance(List<PremisEvent> provenance) {
        this.provenance = provenance;
    }

    public MetsADM getAdministrative() {
        return administrative;
    }

    public void setAdministrative(MetsADM administrative) {
        this.administrative = administrative;
    }

}
