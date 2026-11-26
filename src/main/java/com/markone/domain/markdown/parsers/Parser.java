package com.markone.domain.markdown.parsers;

import com.markone.domain.interfaces.MarkdownStructure;
import com.markone.domain.markdown.parsers.block.HeadingParser;

public class Parser {

    // ATTs
    String line;


    // CON
    public Parser(String line) {
        this.line = line;
    }

    public MarkdownStructure parse() {
       if (HeadingParser.isHeading(line)) {
           return HeadingParser.parseHeader(line);
       }
       return null;
    }
}
