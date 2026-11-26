package com.markone.presentation.renderers;

import com.markone.domain.enums.MarkdownStructures;
import com.markone.domain.interfaces.MarkdownStructure;

import static com.markone.domain.enums.MarkdownStructures.HEADING;

public class MarkdownRenderer {

    public String renderOutput(MarkdownStructure markdownStructure) {
        switch (markdownStructure.getStructure()){
            case HEADING:
                return "# " + markdownStructure.getContent();
            default:
                return "";
        }
    }
}
