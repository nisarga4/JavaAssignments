package com.xworkz.toString.internal;

public class MoviePoster {
    private String movieName;
    private String genre;
    private int year;

    public MoviePoster(String movieName, String genre, int year) {
        this.movieName = movieName;
        this.genre = genre;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MoviePoster{" +
                "MovieName='" + movieName + '\'' +
                ", Genre='" + genre + '\'' +
                ", Year=" + year +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 24024;
    }
}
