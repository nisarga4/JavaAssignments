package com.xworkz.toString.internal;

public class Music {
    private String genre;
    private String artist;
    private int duration; // in minutes

    public Music(String genre, String artist, int duration) {
        this.genre = genre;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Music{" +
                "Genre='" + genre + '\'' +
                ", Artist='" + artist + '\'' +
                ", Duration=" + duration + "min" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 70001;
    }
}
