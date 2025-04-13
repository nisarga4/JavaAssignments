package com.xworkz.toString.internal;

public class MoviePoster {
    private String movieName;
    private String director;
    private int releaseYear;

    public MoviePoster(String movieName, String director, int releaseYear) {
        this.movieName = movieName;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "MoviePoster{" +
                "Movie Name='" + movieName + '\'' +
                ", Director='" + director + '\'' +
                ", Release Year=" + releaseYear +
                '}';
    }

    @Override
    public int hashCode() {
        return movieName.hashCode() + director.hashCode() + Integer.hashCode(releaseYear);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof MoviePoster) {
                MoviePoster otherPoster = (MoviePoster) obj;
                return this.movieName.equals(otherPoster.movieName) &&
                        this.director.equals(otherPoster.director) &&
                        this.releaseYear == otherPoster.releaseYear;
            }
        }
        return false;
    }
}
