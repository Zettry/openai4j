package dev.ai4j.openai4j.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class CustomIntegerDeserializer extends JsonDeserializer<Integer> {
    @Override
    public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        try {
            return p.getIntValue();
        } catch (Exception e) {
            float floatValue = p.getFloatValue();
            return (int) floatValue;
        }
    }
}

