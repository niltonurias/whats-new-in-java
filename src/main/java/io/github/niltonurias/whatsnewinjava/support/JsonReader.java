package io.github.niltonurias.whatsnewinjava.support;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {
    public static <T> T convertJsonToObject(String value, Class<T> klass) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(value, klass);
    }

    public static <T> String convertObjectToJson(T object) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
}
