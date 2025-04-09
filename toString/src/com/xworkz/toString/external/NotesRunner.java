package com.xworkz.toString.external;
import com.xworkz.toString.internal.Notes;

    public class NotesRunner {
        public static void main(String[] args) {
            Notes notes1 = new Notes("Mathematics", "Ravi Kumar", 120, true);
            Notes notes2 = new Notes("Physics", "Anita Sharma", 85, false);

            System.out.println(notes1);
            System.out.println(notes2);
        }
    }
