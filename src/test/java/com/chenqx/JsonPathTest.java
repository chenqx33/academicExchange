package com.chenqx;

import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import com.jayway.jsonpath.spi.json.JacksonJsonProvider;
import com.jayway.jsonpath.spi.json.JsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import com.jayway.jsonpath.spi.mapper.MappingProvider;

import org.apache.commons.io.IOUtils;
import org.apache.shiro.util.CollectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author cqx
 * @date 2018/11/5 18:42
 */
public class JsonPathTest {

    String json;
    JSONObject jsonObject;

    @Before
    public void before(){
        try {
            json = IOUtils.toString(getClass().getClassLoader().getResource("store.json"), "UTF-8");
            jsonObject = JSON.parseObject(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void main() {
        Map<String, Object> map = Maps.newLinkedHashMap();
        map.put("field_name", "name");
        map.put("is_readonly", true);
        map.put("is_required", true);
        map.put("render_type", "text");
        Map<String, Object> map2 = Maps.newLinkedHashMap();
        map2.put("field_name", "name");
        map2.put("is_readonly", true);
        map2.put("is_required", true);
        map2.put("render_type", "text");
        List<Map> list = Lists.newArrayList(map,map2);
//        jsonObject = update(jsonObject, JSONObject.class,"$.layout.components[?(@.api_name=='form_component')].field_section[?(@.api_name=='base_field_section__c')].form_fields[?(@.field_name=='name')].is_readonly","false");
        jsonObject = append(jsonObject,JSONObject.class,"$.layout.components[?(@.api_name=='form_component')].field_section[?(@.api_name=='base_field_section__c')]" +
                ".form_fields",list,true);
        Object s = JsonPath.read(jsonObject,"$.layout.components[?(@.api_name=='form_component')]" +
                ".field_section[?(@.api_name=='base_field_section__c')].form_fields");
        System.out.println(s);
    }


    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        Configuration.setDefaults(new Configuration.Defaults() {
            private final JsonProvider jsonProvider = new JacksonJsonProvider();
            private final MappingProvider mappingProvider = new JacksonMappingProvider();

            @Override
            public JsonProvider jsonProvider() {
                return jsonProvider;
            }

            @Override
            public Set<Option> options() {
                return ImmutableSet.of(Option.ALWAYS_RETURN_LIST);
            }

            @Override
            public MappingProvider mappingProvider() {
                return mappingProvider;
            }
        });
    }

    private static DocumentContext getDocument(Object source) {
        try {
            return JsonPath.parse(MAPPER.writeValueAsString(source));
        } catch (IOException ex) {
            return null;
        } finally {
        }
    }

    private static <T> T parseOrDefault(String json, Class<T> clazz, T defaultValue) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        try {
            return MAPPER.readValue(json, clazz);
        } catch (IOException ex) {
            return defaultValue;
        } finally {
        }
    }

    /**
     * Append entry object on certain path.
     * Do add for array, putAll for Map, and nothing for others.
     */
    public static <T> T append(T source, Class<T> clazz, String path, Object entry) {
        return append(source, clazz, path, entry, false);
    }

    /**
     * Append entry object on certain path.
     * Do add / addAll( if merge is true ) for array, putAll for Map, and nothing for others.
     */
    @SuppressWarnings("unchecked")
    public static <T> T append(T source, Class<T> clazz, String path, Object entry, boolean merge) {
        DocumentContext document = getDocument(source);
        if (null == document) {
            return source;
        }
        List<Object> matches = document.read(path);
        if (CollectionUtils.isEmpty(matches)) {
            return source;
        }
        Object match = matches.get(0);
        if (match instanceof List) {
            if (merge && entry instanceof List) {
                ((List) match).removeAll((List) entry);
                ((List) match).addAll((List) entry);
            } else {
                ((List) match).add(entry);
            }
        } else if (match instanceof Map) {
            ((Map) match).putAll((Map) entry);
        } else {
            return source;
        }
        DocumentContext updatedDocument = document.set(path, match);
        return parseOrDefault(updatedDocument.jsonString(), clazz, source);
    }

    /**
     * Update object to entry on certain path.
     */
    public static <T> T update(T source, Class<T> clazz, String path, Object entry) {
        DocumentContext document = getDocument(source);
        if (null == document) {
            return source;
        }
        Stopwatch stopwatch = Stopwatch.createStarted();
        DocumentContext updatedDocument = document.set(path, entry);
        return parseOrDefault(updatedDocument.jsonString(), clazz, source);
    }

    /**
     * Remove object on certain path.
     * Do nothing if the path could not be parsed.
     */
    public static <T> T remove(T source, Class<T> clazz, String path) {
        DocumentContext document = getDocument(source);
        if (null == document) {
            return source;
        }
        Stopwatch stopwatch = Stopwatch.createStarted();
        DocumentContext updatedDocument = document.delete(path);
        return parseOrDefault(updatedDocument.jsonString(), clazz, source);
    }

    public static <T> T get(Object source, Class<T> clazz, String path) {
        DocumentContext document = getDocument(source);
        if (null == document) {
            return null;
        }
        Stopwatch stopwatch = Stopwatch.createStarted();
        List<Object> matches = document.read(path);
        if (CollectionUtils.isEmpty(matches)) {
            return null;
        }
        Object match = matches.get(0);
        return parseOrDefault(JSONObject.toJSONString(match), clazz, null);
    }
}
