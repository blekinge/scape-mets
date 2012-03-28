package eu.scapeproject.model;

import java.util.Set;

public class Representation {
    private Identifier id;
    private Set<Content> contents;

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

}
