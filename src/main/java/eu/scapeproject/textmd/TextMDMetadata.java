package eu.scapeproject.textmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.mets.MetsTechMD;
import eu.scapeproject.model.UUIDIdentifier;

@XmlRootElement(name="textMD",namespace="info:lc/xmlns/textMD-v3")
@XmlAccessorType(XmlAccessType.FIELD)
public class TextMDMetadata extends MetsTechMD {
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String encoding;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String characterInfo;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String language;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String altLanguage;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String fontScript;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String markupBasis;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String markupLanguage;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String processingNote;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String printRequirements;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String viewingRequirements;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String textNote;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String pageOrder;
    @XmlElement(namespace="info:lc/xmlns/textMD-v3")
    private String pageSequence;
    
    private TextMDMetadata(){
        super(new UUIDIdentifier().getValue(),MetsTechMD.MetadataType.TEXTMD);
    }
    
    public TextMDMetadata(String id) {
        super(id, MetsTechMD.MetadataType.TEXTMD);
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getCharacterInfo() {
        return characterInfo;
    }

    public void setCharacterInfo(String characterInfo) {
        this.characterInfo = characterInfo;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAltLanguage() {
        return altLanguage;
    }

    public void setAltLanguage(String altLanguage) {
        this.altLanguage = altLanguage;
    }

    public String getFontScript() {
        return fontScript;
    }

    public void setFontScript(String fontScript) {
        this.fontScript = fontScript;
    }

    public String getMarkupBasis() {
        return markupBasis;
    }

    public void setMarkupBasis(String markupBasis) {
        this.markupBasis = markupBasis;
    }

    public String getMarkupLanguage() {
        return markupLanguage;
    }

    public void setMarkupLanguage(String markupLanguage) {
        this.markupLanguage = markupLanguage;
    }

    public String getProcessingNote() {
        return processingNote;
    }

    public void setProcessingNote(String processingNote) {
        this.processingNote = processingNote;
    }

    public String getPrintRequirements() {
        return printRequirements;
    }

    public void setPrintRequirements(String printRequirements) {
        this.printRequirements = printRequirements;
    }

    public String getViewingRequirements() {
        return viewingRequirements;
    }

    public void setViewingRequirements(String viewingRequirements) {
        this.viewingRequirements = viewingRequirements;
    }

    public String getTextNote() {
        return textNote;
    }

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }

    public String getPageOrder() {
        return pageOrder;
    }

    public void setPageOrder(String pageOrder) {
        this.pageOrder = pageOrder;
    }

    public String getPageSequence() {
        return pageSequence;
    }

    public void setPageSequence(String pageSequence) {
        this.pageSequence = pageSequence;
    }
    
}
