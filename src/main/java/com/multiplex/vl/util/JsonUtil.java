/**
 * 
 */
package com.multiplex.vl.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author sharduls
 *
 */
/**
 * The Class JsonUtil.
 */
public final class JsonUtil {

    /**
     * objectWriter object.
     */
    private static ObjectMapper mapper = new ObjectMapper();

    /**
     * private constructor is used to avoid object creation.
     */
    private JsonUtil() {
    }

    /**
     * This method deserializes the specified Json into an object of the
     * specified class.
     *
     * @param <T>            It returns any object.
     * @param json            the string from which the object is to be deserialized
     * @param classOfT            the class of T
     * @return an object of type T from the string
     * @throws JsonParseException the json parse exception
     * @throws JsonMappingException the json mapping exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static <T> T fromJson( final String json , final Class<T> classOfT ) throws JsonParseException , JsonMappingException , IOException {
        return mapper.readValue(json, classOfT);
    }

    /**
     * This method serializes the specified object into its equivalent Json
     * representation.
     *
     * @param src            the object for which Json representation is to be created
     *            setting for Gson
     * @return Json representation of String.
     * @throws JsonGenerationException the json generation exception
     * @throws JsonMappingException the json mapping exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static String toJson( final Object src ) throws JsonGenerationException , JsonMappingException , IOException {
        return mapper.writeValueAsString(src);
    }

}
