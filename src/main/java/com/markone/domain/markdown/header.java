package com.markone.domain.markdown;

public class header {
    // ATTs
    int level;
    String content;

    // CONs
    public header(int level, String content) {
        this.level = level;
        this.content = content;
    }

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
    public String toString() {
        return "header{" +
                "content='" + content + '\'' +
                ", level=" + level +
                '}';
    }
}
