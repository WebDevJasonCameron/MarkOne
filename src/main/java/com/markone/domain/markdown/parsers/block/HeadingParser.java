package com.markone.domain.markdown.parsers.block;

import com.markone.domain.enums.MarkdownStructures;
import com.markone.domain.markdown.models.Header;

public class HeadingParser {

    // METH (EVAL)
    public static boolean isHeading(String line) {
        return line.startsWith("#");
    }

    public static Header parseHeader(String line) {
        Header header = new Header();
        header.setLevel(1);
        header.setContent(line);
        return header;
    }

}
