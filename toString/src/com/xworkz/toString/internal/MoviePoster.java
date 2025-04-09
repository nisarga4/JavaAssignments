package com.xworkz.toString.internal;

public class MoviePoster {

        private String movieName;
        private String genre;
        private String director;
        private int releaseYear;

        public MoviePoster(String movieName, String genre, String director, int releaseYear) {
            this.movieName = movieName;
            this.genre = genre;
            this.director = director;
            this.releaseYear = releaseYear;
        }

        @Override
        public String toString() {
            return "MoviePoster{" +
                    "MovieName='" + movieName + '\'' +
                    ", Genre='" + genre + '\'' +
                    ", Director='" + director + '\'' +
                    ", ReleaseYear=" + releaseYear +
                    '}';
        }
    }

