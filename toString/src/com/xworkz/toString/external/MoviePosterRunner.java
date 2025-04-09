package com.xworkz.toString.external;
import com.xworkz.toString.internal.MoviePoster;

    public class MoviePosterRunner {
        public static void main(String[] args) {
            MoviePoster poster1 = new MoviePoster("Interstellar", "Sci-Fi", "Christopher Nolan", 2014);
            MoviePoster poster2 = new MoviePoster("KGF Chapter 2", "Action", "Prashanth Neel", 2022);

            System.out.println(poster1);
            System.out.println(poster2);
        }
    }
