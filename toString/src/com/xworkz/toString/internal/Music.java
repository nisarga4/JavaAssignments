package com.xworkz.toString.internal;

public class Music {
    private String title;
    private String artist;
    private int duration; // Duration in seconds

    public Music(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Music{" +
                "Title='" + title + '\'' +
                ", Artist='" + artist + '\'' +
                ", Duration=" + duration + " seconds" +
                '}';
    }

    @Override
    public int hashCode() {
        return title.hashCode() + artist.hashCode() + duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Music) {
                Music otherMusic = (Music) obj;
                return this.title.equals(otherMusic.title) &&
                        this.artist.equals(otherMusic.artist) &&
                        this.duration == otherMusic.duration;
            }
        }
        return false;
    }
}
