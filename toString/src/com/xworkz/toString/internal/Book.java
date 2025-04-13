package com.xworkz.toString.internal;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{Title='" + title + "', Author='" + author + "', Price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Book) {
                System.out.println("Ref is Book, will compare...");
                Book book1 = this;
                Book book2 = (Book) obj;
                if (book1.title.equals(book2.title) &&
                        book1.author.equals(book2.author) &&
                        book1.price == book2.price) {
                    System.out.println("Both books are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
