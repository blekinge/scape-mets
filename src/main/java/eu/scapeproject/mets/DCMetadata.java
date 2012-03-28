package eu.scapeproject.mets;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "dc", namespace = "http://purl.org/dc/elements/1.1/")
@XmlType(namespace = "http://purl.org/dc/elements/1.1/")
public class DCMetadata {
    // private String date;
    private String title;
    private String creator;
    private String coverage;
    private String description;
    private String format;
    private String subject;
    private String type;
    @XmlElementWrapper(name = "lanuages")
    private List<String> language = new ArrayList<String>();
    @XmlElementWrapper(name = "publishers")
    private List<String> publisher = new ArrayList<String>();
    @XmlElementWrapper(name = "sources")
    private List<String> sources = new ArrayList<String>();
    @XmlElementWrapper(name = "relations")
    private List<String> relations = new ArrayList<String>();
    @XmlElementWrapper(name = "contributors")
    private List<String> contributors = new ArrayList<String>();
    @XmlElementWrapper(name = "rights")
    private List<String> rights = new ArrayList<String>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getRights() {
        return rights;
    }

    public void addRights(String rights) {
        this.rights.add(rights);
    }

    public String getCreator() {
        return creator;
    }

    public String getCoverage() {
        return coverage;
    }

    public String getDescription() {
        return description;
    }

    public String getFormat() {
        return format;
    }

    public String getSubject() {
        return subject;
    }

    public String getType() {
        return type;
    }

    public List<String> getLanguage() {
        return language;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public List<String> getSources() {
        return sources;
    }

    public List<String> getRelations() {
        return relations;
    }

    public List<String> getContributors() {
        return contributors;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
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

    public void setType(String type) {
        this.type = type;
    }

    public void addLanguage(String language) {
        this.language.add(language);
    }

    public void addPublisher(String publisher) {
        this.publisher.add(publisher);
    }

    public void addSources(String sources) {
        this.sources.add(sources);
    }

    public void addRelations(String relation) {
        this.relations.add(relation);
    }

    public void addContributors(String contributor) {
        this.contributors.add(contributor);
    }


}
