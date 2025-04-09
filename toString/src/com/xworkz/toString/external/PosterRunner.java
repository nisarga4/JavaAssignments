package com.xworkz.toString.external;

import com.xworkz.toString.internal.Poster;

    public class PosterRunner {
        public static void main(String[] args) {
            Poster poster1 = new Poster("Nature Vibes", "Nature", 24.0, 18.0);
            Poster poster2 = new Poster("Superhero Blast", "Action", 36.0, 24.0);

            System.out.println(poster1);
            System.out.println(poster2);
        }
    }

