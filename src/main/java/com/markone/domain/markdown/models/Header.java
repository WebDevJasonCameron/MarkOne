package com.markone.domain.markdown.models;

import com.markone.domain.enums.MarkdownStructures;
import com.markone.domain.interfaces.MarkdownStructure;

public class Header implements MarkdownStructure {

    // ATT
    final private MarkdownStructures structure = MarkdownStructures.HEADING;
    private int level;
    private String content;

    // CONs

    // GETs & SETs
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    // OVRs
    @Override
    public MarkdownStructure getStructure() {
        return null;
    }

    @Override
    public String toString() {
        return "Header{" +
                "structure=" + structure +
                ", level=" + level +
                ", content='" + content + '\'' +
                '}';
    }

}
