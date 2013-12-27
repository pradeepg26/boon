package org.boon.json.implementation;

import org.boon.json.JsonParser;

import java.nio.charset.StandardCharsets;

/**
 * Created by rick on 12/15/13.
 */
public class JsonAsciiParser extends JsonBaseByteArrayParser implements JsonParser {



    public JsonAsciiParser() {
        this.charset = StandardCharsets.US_ASCII;
    }

    protected final void addChar() {
        builder.addChar( __currentChar );
    }

}