package com.example.projectsound;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;


class JsonSaveFile

{
    String fileName = "savefile.json";

    void write() throws FileNotFoundException {
// i stole the code from online !!!!
        JSONObject jo = new JSONObject();


        Song song1 = new Song("Midnight Rain","ghffgh",3.76,2022);
        // putting data to JSONObject
        jo.put("songName",song1.getSongName());
        jo.put("artist",song1.getArtist());
        jo.put("runTimeInMinutes",song1.getRunTimeInMinutes());
        jo.put("yearReleased",song1.getYearReleased());

        System.out.println(jo.get("songName"));
        System.out.println(jo.get("runTimeInMinutes"));

        PrintWriter pw = new PrintWriter(fileName);
        pw.write(jo.toJSONString());

        pw.flush();
        pw.close();

    }
    void read() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:/Users/yoitt/IdeaProjects/projectsound/savefile.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String songName = (String)jsonObject.get("songName");
            String artist = (String)jsonObject.get("artist");
            double runTimeInMinutes = (double)jsonObject.get("runTimeInMinutes");
            System.out.println(jsonObject.get("yearReleased"));
            System.out.println(songName);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    private void parseEmployeeObject(JSONObject song) {

        JSONObject songObject = (JSONObject) song.get("song");

        //Get employee first name
        String songName = (String) songObject.get("songName");
        System.out.println(songName);

        //Get employee last name
        String artist = (String) songObject.get("artist");
        System.out.println(artist);

        //Get employee website name
        double runTimeInMinutes = (double) songObject.get("runTimeInMinutes");
        System.out.println(runTimeInMinutes);
    }
}

