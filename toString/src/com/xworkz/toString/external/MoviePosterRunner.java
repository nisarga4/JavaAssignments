package com.xworkz.toString.external;

import com.xworkz.toString.internal.MoviePoster;

public class MoviePosterRunner {
    public static void main(String[] args) {
        MoviePoster poster1 = new MoviePoster("Inception", "Christopher Nolan", 2010);
        System.out.println(poster1);

        int hash = poster1.hashCode();
        System.out.println("Hash Code: " + hash);

        MoviePoster poster2 = new MoviePoster("Inception", "Christopher Nolan", 2010);
        MoviePoster poster3 = new MoviePoster("Interstellar", "Christopher Nolan", 2014);

        System.out.println("Checking same location: " + (poster1 == poster2));
        boolean same = poster1.equals(poster2);
        System.out.println("Poster1 is same as Poster2: " + same);

        boolean different = poster1.equals(poster3);
        System.out.println("Poster1 is same as Poster3: " + different);
    }
}
