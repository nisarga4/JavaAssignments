package com.xworkz.Casting;

    public class Studio {

        public void reviewArt(Artist artist) {
            artist.sketch();
            artist.paint();
            artist.sculpt();
            artist.design();
            artist.exhibit();

            if (artist instanceof Painter) {
                Painter painter = (Painter) artist;
                painter.mixColors(); // Unique method
            }
        }
    }
