package com.example.andy.encryption;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by andy on 2017/8/20.
 */

class JsonUtils {
    public static String objectToJsonForFastJson(List<Person> personList) {
        JSONArray array=new JSONArray();
        for(Person p:personList)
        {
            JSONObject o=new JSONObject();
            try {
                o.put("name",p.getName());
                o.put("age",p.getAge());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            array.put(o);
        }
        return array.toString();
    }
}
