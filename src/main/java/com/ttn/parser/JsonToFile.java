package com.ttn.parser;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonToFile {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name", "ajay singh jodha");
        obj.put("age", new Integer(22));

        JSONArray list = new JSONArray();
        list.add("JVM");
        list.add("C++");
        list.add("spring");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter("/home/ajay/xml&json/src/main/java/com/ttn/json/TestWrite.json")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

}