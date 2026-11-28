package com.markone.presentation.renderers;

import com.markone.domain.interfaces.MarkdownStructure;
import com.markone.presentation.renderers.block.HeadingRenderer;

public class MarkdownRenderer {

    HeadingRenderer headingRenderer = new HeadingRenderer();

    public String renderOutput(MarkdownStructure markdownStructure) {
        switch (markdownStructure.getStructure()){
            case HEADING:
//                return "# " + markdownStructure.getContent();
                return headingRenderer.renderHeader(markdownStructure);
            default:
                return "";
        }
    }
}
