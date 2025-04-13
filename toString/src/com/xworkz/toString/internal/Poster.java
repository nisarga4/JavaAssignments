package com.xworkz.toString.internal;

public class Poster {
    private String title;
    private String artist;
    private int year;

    public Poster(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "Title='" + title + '\'' +
                ", Artist='" + artist + '\'' +
                ", Year=" + year +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Poster) {
                Poster otherPoster = (Poster) obj;
                return this.title.equals(otherPoster.title) &&
                        this.artist.equals(otherPoster.artist) &&
                        this.year == otherPoster.year;
            }
        }
        return false;
    }
}
