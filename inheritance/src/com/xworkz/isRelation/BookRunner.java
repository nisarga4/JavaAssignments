package com.xworkz.isRelation;

import com.xworkz.inheritance.Shelf;
import com.xworkz.inheritance.Book;

    public class BookRunner {
        public static void main(String[] args) {
            Shelf shelf = new Shelf();
            shelf.open();
            shelf.read();
            shelf.bookmark();
            shelf.close();
            shelf.store();

            System.out.println("--------------------------------------");

            Book book = new Shelf(); // Polymorphic reference
            book.open();
            book.read();
            book.bookmark();
            book.close();
            book.store();
        }
    }