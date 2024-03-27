package com.java.assignment7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileHandler {

    public static void main(String[] args) {

        String inputFile = "src/main/resources/Input.json";
        String outputFile = "src/main/resources/Output.json";

        JSONObject jsonObject = readJSONFile(inputFile);

        if (jsonObject != null) {

            jsonObject.put("1", "Nandini");
            jsonObject.put("2", "Jangiti");

            saveJSONToFile(jsonObject, outputFile);

            System.out.println("JSON file modified and saved successfully.");
        } else {
            System.out.println("Failed to read JSON file.");
        }
    }

    public static JSONObject readJSONFile(String filePath) {
        JSONParser p = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            return (JSONObject) p.parse(reader);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void saveJSONToFile(JSONObject jo, String filePath) {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jo.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
