package eu.scapeproject.dc;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "dc", namespace = "http://purl.org/dc/elements/1.1/")
@XmlAccessorType(XmlAccessType.FIELD)
public class DCMetadata {
    // private String date;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    private String title;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    private String creator;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    private String coverage;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    private String description;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    private String format;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    private String subject;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    private String type;
    @XmlElementWrapper(name = "lanuages", namespace = "http://purl.org/dc/elements/1.1/")
    private List<String> language = new ArrayList<String>();
    @XmlElementWrapper(name = "publishers", namespace = "http://purl.org/dc/elements/1.1/")
    private List<String> publisher = new ArrayList<String>();
    @XmlElementWrapper(name = "sources", namespace = "http://purl.org/dc/elements/1.1/")
    private List<String> sources = new ArrayList<String>();
    @XmlElementWrapper(name = "relations", namespace = "http://purl.org/dc/elements/1.1/")
    private List<String> relations = new ArrayList<String>();
    @XmlElementWrapper(name = "contributors", namespace = "http://purl.org/dc/elements/1.1/")
    private List<String> contributors = new ArrayList<String>();
    @XmlElementWrapper(name = "rights", namespace = "http://purl.org/dc/elements/1.1/")
    private List<String> rights = new ArrayList<String>();

    private DCMetadata(Builder builder) {
        this.title = builder.title;
        this.creator = builder.creator;
        this.coverage = builder.coverage;
        this.description = builder.description;
        this.format = builder.format;
        this.subject = builder.subject;
        this.type = builder.type;
        this.language = builder.language;
        this.publisher = builder.publisher;
        this.sources = builder.sources;
        this.relations = builder.relations;
        this.contributors = builder.contributors;
        this.rights = builder.rights;
    }
    
    private DCMetadata(){
        super();
    }

    public void addContributors(String contributor) {
        this.contributors.add(contributor);
    }

    public void addLanguage(String language) {
        this.language.add(language);
    }

    public void addPublisher(String publisher) {
        this.publisher.add(publisher);
    }

    public void addRelations(String relation) {
        this.relations.add(relation);
    }

    public void addRights(String rights) {
        this.rights.add(rights);
    }

    public void addSources(String sources) {
        this.sources.add(sources);
    }

    public List<String> getContributors() {
        return contributors;
    }

    public String getCoverage() {
        return coverage;
    }

    public String getCreator() {
        return creator;
    }

    public String getDescription() {
        return description;
    }

    public String getFormat() {
        return format;
    }

    public List<String> getLanguage() {
        return language;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public List<String> getRelations() {
        return relations;
    }

    public List<String> getRights() {
        return rights;
    }

    public List<String> getSources() {
        return sources;
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        private String title;
        private String creator;
        private String coverage;
        private String description;
        private String format;
        private String subject;
        private String type;
        private List<String> language;
        private List<String> publisher;
        private List<String> sources;
        private List<String> relations;
        private List<String> contributors;
        private List<String> rights;

        public DCMetadata build() {
            return new DCMetadata(this);
        }

        public Builder contributors(List<String> contributors) {
            this.contributors = contributors;
            return this;
        }

        public Builder coverage(String coverage) {
            this.coverage = coverage;
            return this;
        }

        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder format(String format) {
            this.format = format;
            return this;
        }

        public Builder language(List<String> language) {
            this.language = language;
            return this;
        }

        public Builder publisher(List<String> publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder relations(List<String> relations) {
            this.relations = relations;
            return this;
        }

        public Builder rights(List<String> rights) {
            this.rights = rights;
            return this;
        }

        public Builder sources(List<String> sources) {
            this.sources = sources;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }
    }
}
