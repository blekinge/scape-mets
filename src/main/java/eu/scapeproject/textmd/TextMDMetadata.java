package eu.scapeproject.textmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import eu.scapeproject.mets.MetsTechMD;
import eu.scapeproject.model.UUIDIdentifier;

@XmlRootElement(name = "textMD", namespace = "info:lc/xmlns/textMD-v3")
@XmlAccessorType(XmlAccessType.FIELD)
public class TextMDMetadata extends MetsTechMD {
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String encoding;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String characterInfo;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String language;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String altLanguage;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String fontScript;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String markupBasis;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String markupLanguage;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String processingNote;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String printRequirements;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String viewingRequirements;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String textNote;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String pageOrder;
    @XmlElement(namespace = "info:lc/xmlns/textMD-v3")
    private String pageSequence;

    private TextMDMetadata() {
        super(new UUIDIdentifier().getValue(), MetsTechMD.MetadataType.TEXTMD);
    }

    private TextMDMetadata(Builder builder) {
        super(new UUIDIdentifier().getValue(),MetsTechMD.MetadataType.TEXTMD);
        this.encoding = builder.encoding;
        this.characterInfo = builder.characterInfo;
        this.language = builder.language;
        this.altLanguage = builder.altLanguage;
        this.fontScript = builder.fontScript;
        this.markupBasis = builder.markupBasis;
        this.markupLanguage = builder.markupLanguage;
        this.processingNote = builder.processingNote;
        this.printRequirements = builder.printRequirements;
        this.viewingRequirements = builder.viewingRequirements;
        this.textNote = builder.textNote;
        this.pageOrder = builder.pageOrder;
        this.pageSequence = builder.pageSequence;
    }

    public TextMDMetadata(String id) {
        super(id, MetsTechMD.MetadataType.TEXTMD);
    }

    public String getAltLanguage() {
        return altLanguage;
    }

    public String getCharacterInfo() {
        return characterInfo;
    }

    public String getEncoding() {
        return encoding;
    }

    public String getFontScript() {
        return fontScript;
    }

    public String getLanguage() {
        return language;
    }

    public String getMarkupBasis() {
        return markupBasis;
    }

    public String getMarkupLanguage() {
        return markupLanguage;
    }

    public String getPageOrder() {
        return pageOrder;
    }

    public String getPageSequence() {
        return pageSequence;
    }

    public String getPrintRequirements() {
        return printRequirements;
    }

    public String getProcessingNote() {
        return processingNote;
    }

    public String getTextNote() {
        return textNote;
    }

    public String getViewingRequirements() {
        return viewingRequirements;
    }

    public void setAltLanguage(String altLanguage) {
        this.altLanguage = altLanguage;
    }

    public void setCharacterInfo(String characterInfo) {
        this.characterInfo = characterInfo;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void setFontScript(String fontScript) {
        this.fontScript = fontScript;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setMarkupBasis(String markupBasis) {
        this.markupBasis = markupBasis;
    }

    public void setMarkupLanguage(String markupLanguage) {
        this.markupLanguage = markupLanguage;
    }

    public void setPageOrder(String pageOrder) {
        this.pageOrder = pageOrder;
    }

    public void setPageSequence(String pageSequence) {
        this.pageSequence = pageSequence;
    }

    public void setPrintRequirements(String printRequirements) {
        this.printRequirements = printRequirements;
    }

    public void setProcessingNote(String processingNote) {
        this.processingNote = processingNote;
    }

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }

    public void setViewingRequirements(String viewingRequirements) {
        this.viewingRequirements = viewingRequirements;
    }

    public static class Builder {
        private String encoding;
        private String characterInfo;
        private String language;
        private String altLanguage;
        private String fontScript;
        private String markupBasis;
        private String markupLanguage;
        private String processingNote;
        private String printRequirements;
        private String viewingRequirements;
        private String textNote;
        private String pageOrder;
        private String pageSequence;

        public Builder altLanguage(String altLanguage) {
            this.altLanguage = altLanguage;
            return this;
        }

        public TextMDMetadata build() {
            return new TextMDMetadata(this);
        }

        public Builder characterInfo(String characterInfo) {
            this.characterInfo = characterInfo;
            return this;
        }

        public Builder encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder fontScript(String fontScript) {
            this.fontScript = fontScript;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public Builder markupBasis(String markupBasis) {
            this.markupBasis = markupBasis;
            return this;
        }

        public Builder markupLanguage(String markupLanguage) {
            this.markupLanguage = markupLanguage;
            return this;
        }

        public Builder pageOrder(String pageOrder) {
            this.pageOrder = pageOrder;
            return this;
        }

        public Builder pageSequence(String pageSequence) {
            this.pageSequence = pageSequence;
            return this;
        }

        public Builder printRequirements(String printRequirements) {
            this.printRequirements = printRequirements;
            return this;
        }

        public Builder processingNote(String processingNote) {
            this.processingNote = processingNote;
            return this;
        }

        public Builder textNote(String textNote) {
            this.textNote = textNote;
            return this;
        }

        public Builder viewingRequirements(String viewingRequirements) {
            this.viewingRequirements = viewingRequirements;
            return this;
        }
    }
}
