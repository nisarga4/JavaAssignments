package com.xworkz.Runner;

import com.xworkz.Casting.Artist;
import com.xworkz.Casting.Painter;
import com.xworkz.Casting.Studio;

public class StudioRunner {
        public static void main(String[] args) {
            Artist artist = new Painter(); // Upcasting
            Studio studio = new Studio();
            studio.reviewArt(artist);
        }
    }
