package com.markone.presentation.renderers.block;

import com.markone.domain.interfaces.MarkdownStructure;

import java.util.concurrent.atomic.AtomicReference;

public class HeadingRenderer {

    public String renderHeader(MarkdownStructure heading) {
        AtomicReference<String> output = new AtomicReference<>("Markdown Structure: HEADING " +
                heading.getContent());
        return output.get();
    }
}
