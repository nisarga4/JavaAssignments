package com.xworkz.toString.internal;
    public class Novel {
        private String title;
        private String author;
        private String genre;
        private int pages;

        public Novel(String title, String author, String genre, int pages) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.pages = pages;
        }

        @Override
        public String toString() {
            return "Novel{" +
                    "Title='" + title + '\'' +
                    ", Author='" + author + '\'' +
                    ", Genre='" + genre + '\'' +
                    ", Pages=" + pages +
                    '}';
        }
    }
