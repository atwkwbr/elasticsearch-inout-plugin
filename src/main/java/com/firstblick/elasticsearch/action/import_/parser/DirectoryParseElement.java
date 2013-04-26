package com.firstblick.elasticsearch.action.import_.parser;

import org.elasticsearch.common.xcontent.XContentParser;

import com.firstblick.elasticsearch.action.export.ExportContext;
import com.firstblick.elasticsearch.action.import_.ImportContext;

public class DirectoryParseElement implements ImportParseElement {

    @Override
    public void parse(XContentParser parser, ImportContext context)
            throws Exception {
        XContentParser.Token token = parser.currentToken();
        if (token.isValue()) {
            context.directory(parser.text());
        }
    }

}
