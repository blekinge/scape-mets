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
    @XmlElement(namespace="http://purl.org/dc/elements/1.1/")
    private String title;
    @XmlElement(namespace="http://purl.org/dc/elements/1.1/")
    private String creator;
    @XmlElement(namespace="http://purl.org/dc/elements/1.1/")
    private String coverage;
    @XmlElement(namespace="http://purl.org/dc/elements/1.1/")
    private String description;
    @XmlElement(namespace="http://purl.org/dc/elements/1.1/")
    private String format;
    @XmlElement(namespace="http://purl.org/dc/elements/1.1/")
    private String subject;
    @XmlElement(namespace="http://purl.org/dc/elements/1.1/")
    private String type;
    @XmlElementWrapper(name = "lanuages",namespace="http://purl.org/dc/elements/1.1/")
    private List<String> language = new ArrayList<String>();
    @XmlElementWrapper(name = "publishers",namespace="http://purl.org/dc/elements/1.1/")
    private List<String> publisher = new ArrayList<String>();
    @XmlElementWrapper(name = "sources",namespace="http://purl.org/dc/elements/1.1/")
    private List<String> sources = new ArrayList<String>();
    @XmlElementWrapper(name = "relations",namespace="http://purl.org/dc/elements/1.1/")
    private List<String> relations = new ArrayList<String>();
    @XmlElementWrapper(name = "contributors",namespace="http://purl.org/dc/elements/1.1/")
    private List<String> contributors = new ArrayList<String>();
    @XmlElementWrapper(name = "rights",namespace="http://purl.org/dc/elements/1.1/")
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
