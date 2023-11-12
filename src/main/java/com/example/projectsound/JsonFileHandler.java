package com.example.projectsound;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class JsonSaveFile

{
    String fileName = "savefile.json";

    void write() throws FileNotFoundException {
// i stole the code from online !!!!
        JSONObject jo = new JSONObject();

        Song song1 = new Song("Midnight Rain","Taylor Swift",3.67,2022);
        // putting data to JSONObject
        jo.put("songName",song1.getSongName());
        jo.put("artist",song1.getArtist());
        jo.put("runTimeInMinutes",song1.getArtist());
        jo.put("yearReleased",song1.getYearReleased());

        System.out.println(jo.get("songName"));
/*
        // for address data, first create LinkedHashMap
        Map m = new LinkedHashMap(4);
        m.put("streetAddress", "21 2nd Street");
        m.put("city", "New York");
        m.put("state", "NY");
        m.put("postalCode", 10021);

        // putting address to JSONObject
        jo.put("address", m);

        // for phone numbers, first create JSONArray
        JSONArray ja = new JSONArray();

        m = new LinkedHashMap(2);
        m.put("type", "home");
        m.put("number", "212 555-1234");

        // adding map to list
        ja.add(m);

        m = new LinkedHashMap(2);
        m.put("type", "fax");
        m.put("number", "212 555-1234");

        // adding map to list
        ja.add(m);

        // putting phoneNumbers to JSONObject
        jo.put("phoneNumbers", ja);
*/
        // writing JSON to file:"JSONExample.json" in cwd
        PrintWriter pw = new PrintWriter(fileName);
        pw.write(jo.toJSONString());

        pw.flush();
        pw.close();

    }
    void read() throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader(fileName));

        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;

        // getting firstName and lastName
        String songName = (String) jo.get("songName");
        String artist = (String) jo.get("artist");
        double age = (double) jo.get("runTimeInMinutes");
        int yearReleased = (int) jo.get("yearReleased");

        System.out.println(songName);
        System.out.println(artist);

        // getting age

        System.out.println(age);
        System.out.println(yearReleased);
/*
        // getting address
        Map address = ((Map)jo.get("address"));

        // iterating address Map
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        // getting phoneNumbers
        JSONArray ja = (JSONArray) jo.get("phoneNumbers");

        // iterating phoneNumbers
        Iterator itr2 = ja.iterator();

        while (itr2.hasNext())
        {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }

 */
    }
}

