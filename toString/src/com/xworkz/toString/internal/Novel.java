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
        return title.hashCode() + author.hashCode() + Integer.hashCode(pages);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Novel) {
                Novel otherNovel = (Novel) obj;
                return this.title.equals(otherNovel.title) &&
                        this.author.equals(otherNovel.author) &&
                        this.pages == otherNovel.pages;
            }
        }
        return false;
    }
}
