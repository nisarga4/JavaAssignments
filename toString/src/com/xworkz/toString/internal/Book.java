package com.xworkz.toString.internal;

public class Book {
        private String title;
        private String author;
        private String genre;
        private double price;

        public Book(String title, String author, String genre, double price) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "Title='" + title + '\'' +
                    ", Author='" + author + '\'' +
                    ", Genre='" + genre + '\'' +
                    ", Price=₹" + price +
                    '}';
        }
    }

