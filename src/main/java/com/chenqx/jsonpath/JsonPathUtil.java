package com.chenqx.jsonpath;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import org.apache.shiro.util.CollectionUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author cqx
 * @date 2018/11/14 12:41
 */
public class JsonPathUtil {

//    private static final ObjectMapper MAPPER = new ObjectMapper();
//
//    private static DocumentContext getDocument(Object source) {
//        try {
//            return JsonPath.parse(MAPPER.writeValueAsString(source));
//        } catch (IOException ex) {
//            return null;
//        } finally {
//        }
//    }
//
//    private static <T> T parseOrDefault(String json, Class<T> clazz, T defaultValue) {
//        try {
//            return MAPPER.readValue(json, clazz);
//        } catch (IOException ex) {
//            return defaultValue;
//        } finally {
//        }
//    }
//
//    /**
//     * Append entry object on certain path.
//     * Do add for array, putAll for Map, and nothing for others.
//     */
//    public static <T> T append(T source, Class<T> clazz, String path, Object entry) {
//        return append(source, clazz, path, entry, false);
//    }
//
//    /**
//     * Append entry object on certain path.
//     * Do add / addAll( if merge is true ) for array, putAll for Map, and nothing for others.
//     */
//    @SuppressWarnings("unchecked")
//    public static <T> T append(T source, Class<T> clazz, String path, Object entry, boolean merge) {
//        DocumentContext document = getDocument(source);
//        if (null == document) {
//            return source;
//        }
//        List<Object> matches = document.read(path);
//        if (CollectionUtils.isEmpty(matches)) {
//            return source;
//        }
//        Object match = matches.get(0);
//        if (match instanceof List) {
//            if (merge && entry instanceof List) {
//                ((List) match).removeAll((List) entry);
//                ((List) match).addAll((List) entry);
//            } else {
//                ((List) match).add(entry);
//            }
//        } else if (match instanceof Map) {
//            ((Map) match).putAll((Map) entry);
//        } else {
//            return source;
//        }
//        DocumentContext updatedDocument = document.set(path, match);
//        return parseOrDefault(updatedDocument.jsonString(), clazz, source);
//    }
//
//    /**
//     * Update object to entry on certain path.
//     */
//    public static <T> T update(T source, Class<T> clazz, String path, Object entry) {
//        DocumentContext document = getDocument(source);
//        if (null == document) {
//            return source;
//        }
//        DocumentContext updatedDocument = document.set(path, entry);
//        return parseOrDefault(updatedDocument.jsonString(), clazz, source);
//    }
//
//    /**
//     * Remove object on certain path.
//     * Do nothing if the path could not be parsed.
//     */
//    public static <T> T remove(T source, Class<T> clazz, String path) {
//        DocumentContext document = getDocument(source);
//        if (null == document) {
//            return source;
//        }
//        DocumentContext updatedDocument = document.delete(path);
//        return parseOrDefault(updatedDocument.jsonString(), clazz, source);
//    }
//
//    public static <T> T get(Object source, Class<T> clazz, String path) {
//        DocumentContext document = getDocument(source);
//        if (null == document) {
//            return null;
//        }
//        List<Object> matches = document.read(path);
//        if (CollectionUtils.isEmpty(matches)) {
//            return null;
//        }
//        Object match = matches.get(0);
//        return parseOrDefault(JSONObject.toJSONString(match), clazz, null);
//    }

}
