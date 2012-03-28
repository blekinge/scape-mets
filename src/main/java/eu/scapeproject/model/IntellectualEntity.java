package eu.scapeproject.model;

import java.util.Set;

public class IntellectualEntity {
    private Identifier id;
    private Set<Representation> representations;
    
    public Identifier getId() {
        return id;
    }
    public void setId(Identifier id) {
        this.id = id;
    }
    public Set<Representation> getRepresentations() {
        return representations;
    }
    public void setRepresentations(Set<Representation> representations) {
        this.representations = representations;
    }
}
