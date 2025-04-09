package com.xworkz.toString.internal;

public class Poster {
        private String title;
        private String theme;
        private double height;
        private double width;

        public Poster(String title, String theme, double height, double width) {
            this.title = title;
            this.theme = theme;
            this.height = height;
            this.width = width;
        }

        @Override
        public String toString() {
            return "Poster{" +
                    "Title='" + title + '\'' +
                    ", Theme='" + theme + '\'' +
                    ", Height=" + height + " inches" +
                    ", Width=" + width + " inches" +
                    '}';
        }
    }
