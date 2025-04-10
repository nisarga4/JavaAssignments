package com.xworkz.toString.internal;

public class Novel {
    private String title;
    private String author;
    private int pages;

    public Novel(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Pages=" + pages +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 27027;
    }
}
