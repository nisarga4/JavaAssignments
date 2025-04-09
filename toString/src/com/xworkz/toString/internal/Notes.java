package com.xworkz.toString.internal;
    public class Notes {
        private String subject;
        private String author;
        private int numberOfPages;
        private boolean isHandwritten;

        public Notes(String subject, String author, int numberOfPages, boolean isHandwritten) {
            this.subject = subject;
            this.author = author;
            this.numberOfPages = numberOfPages;
            this.isHandwritten = isHandwritten;
        }

        @Override
        public String toString() {
            return "Notes{" +
                    "Subject='" + subject + '\'' +
                    ", Author='" + author + '\'' +
                    ", Pages=" + numberOfPages +
                    ", Handwritten=" + (isHandwritten ? "Yes" : "No") +
                    '}';
        }
    }