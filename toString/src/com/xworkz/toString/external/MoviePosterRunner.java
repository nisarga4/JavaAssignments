package com.xworkz.toString.external;

import com.xworkz.toString.internal.MoviePoster;

public class MoviePosterRunner {
    public static void main(String[] args) {
        MoviePoster m1 = new MoviePoster("Inception", "Sci-Fi", 2010);
        MoviePoster m2 = new MoviePoster("RRR", "Action", 2022);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("HashCode1: " + m1.hashCode());
        System.out.println("HashCode2: " + m2.hashCode());
        System.out.println(new MoviePoster("Titanic", "Romance", 1997).hashCode());
    }
}
