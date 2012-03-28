package eu.scapeproject.model;

import java.util.Set;

import eu.scapeproject.mets.DCMetadata;

public class IntellectualEntity {
    private Identifier id;
    private Set<Representation> representations;
    private DCMetadata descriptive;
    
    public Identifier getId() {
        return id;
    }
    public void setId(Identifier id) {
        this.id = id;
    }
    
    public DCMetadata getDescriptive() {
        return descriptive;
    }
    public void setDescriptive(DCMetadata descriptive) {
        this.descriptive = descriptive;
    }
    public Set<Representation> getRepresentations() {
        return representations;
    }
    public void setRepresentations(Set<Representation> representations) {
        this.representations = representations;
    }
}
