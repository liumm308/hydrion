package com.library.manage.common.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.*;

public class JsonPluginsUtil {

    public JsonPluginsUtil() {
    }

    public static JSONObject strToJsonObj(String jsonString) {
        return JSONObject.parseObject(jsonString);
    }

    public static String mapToString(Map map) {
        return JSON.toJSONString(map);
    }

    public static JSONArray strToJsonArray(String jsonString) {
        return JSONArray.parseArray(jsonString);
    }

    public static <T> T jsonToBean(String jsonString, Class<T> beanCalss) {
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        T bean = JSONObject.toJavaObject(jsonObject, beanCalss);
        return bean;
    }

    public static <T> T jsonObjToBean(JSONObject obj, Class<T> beanCalss) {
        T bean = JSONObject.toJavaObject(obj, beanCalss);
        return bean;
    }

    public static String beanToJson(Object bean) {
        return JSONObject.toJSONString(bean, false);
    }

    public static JSONObject beanToJsonObj(Object bean) {
        return (JSONObject) JSONObject.toJSON(bean);
    }

    public static String beanListToJson(List beans) {
        JSONArray array = beanListToJsonArray(beans);
        return array.toJSONString();
    }

    public static JSONArray beanListToJsonArray(List beans) {
        JSONArray rest = new JSONArray();

        for (int i = 0; i < beans.size(); ++i) {
            rest.add(beanToJsonObj(beans.get(i)));
        }

        return rest;
    }

    public static Map jsonToMap(String jsonString) {
        Map valueMap = new HashMap();
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        Set<String> sets = jsonObject.keySet();
        if (sets == null) {
            return valueMap;
        } else {
            Iterator keyIter = sets.iterator();

            while (keyIter.hasNext()) {
                String key = (String) keyIter.next();
                valueMap.put(key, jsonObject.get(key));
            }

            return valueMap;
        }
    }

    public static String mapToJson(Object map) {
        String s_json = "";
        s_json = JSONObject.toJSONString(map);
        return s_json;
    }

    public static Object[] jsonToObjectArray(String jsonString) {
        JSONArray jsonArray = JSONArray.parseArray(jsonString);
        return jsonArray.toArray();
    }

    public static <T> List<T> jsonToBeanList(String jsonString, Class<T> beanClass) {
        JSONArray jsonArray = JSONArray.parseArray(jsonString);
        int size = jsonArray.size();
        List<T> list = new ArrayList(size);

        for (int i = 0; i < size; ++i) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            T bean = jsonObjToBean(jsonObject, beanClass);
            list.add(bean);
        }

        return list;
    }

    public static <T> List<T> jsonArrayToBeanList(JSONArray jsonArray, Class<T> beanClass) {
        int size = jsonArray.size();
        List<T> list = new ArrayList(size);

        for (int i = 0; i < size; ++i) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            T bean = jsonObjToBean(jsonObject, beanClass);
            list.add(bean);
        }

        return list;
    }

    public static String[] jsonToStringArray(String jsonString) {
        JSONArray jsonArray = JSONArray.parseArray(jsonString);
        String[] stringArray = new String[jsonArray.size()];
        int size = jsonArray.size();

        for (int i = 0; i < size; ++i) {
            stringArray[i] = jsonArray.getString(i);
        }

        return stringArray;
    }

    public static Long[] jsonToLongArray(String jsonString) {
        JSONArray jsonArray = JSONArray.parseArray(jsonString);
        int size = jsonArray.size();
        Long[] longArray = new Long[size];

        for (int i = 0; i < size; ++i) {
            longArray[i] = jsonArray.getLong(i);
        }

        return longArray;
    }

    public static Integer[] jsonToIntegerArray(String jsonString) {
        JSONArray jsonArray = JSONArray.parseArray(jsonString);
        int size = jsonArray.size();
        Integer[] integerArray = new Integer[size];

        for (int i = 0; i < size; ++i) {
            integerArray[i] = jsonArray.getInteger(i);
        }

        return integerArray;
    }

    public static Double[] jsonToDoubleArray(String jsonString) {
        JSONArray jsonArray = JSONArray.parseArray(jsonString);
        int size = jsonArray.size();
        Double[] doubleArray = new Double[size];

        for (int i = 0; i < size; ++i) {
            doubleArray[i] = jsonArray.getDouble(i);
        }

        return doubleArray;
    }

    public static String toPrintString(Object obj) {
        return JSONArray.toJSONString(obj, true);
    }

    public static boolean isJsonArrayType(String jsonStr) {
        boolean flag = false;
        new Gson();
        JsonParser ps = new JsonParser();
        JsonElement jsonEle = ps.parse(jsonStr);
        if (jsonEle.isJsonArray()) {
            flag = true;
        }

        return flag;
    }
}
