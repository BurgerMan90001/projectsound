package com.example.projectsound;

public class Song {

    private String songName;
    private String artist;
    private double runTimeInMinutes;
    private int yearReleased; //not really needed


    Song(String songName, String artist, double runTimeInMinutes, int yearReleased) {
        this.songName = songName;
        this.artist = artist;
        this.runTimeInMinutes = runTimeInMinutes;
        this.yearReleased = yearReleased;
    }
    // getterz
    public String getSongName() {
        return songName;
    }
    public String getArtist() {
        return artist;
    }
    public double getRunTimeInMinutes() {
        return runTimeInMinutes;
    }
    public int getYearReleased() {
        return yearReleased;
    }

    // setterz


}
