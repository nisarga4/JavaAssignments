package com.xworkz.isRelation;
import com.xworkz.inheritance.Art;
import com.xworkz.inheritance.Style;

    public class ArtRunner {
        public static void main(String[] args) {
            Style style = new Style();
            style.create();
            style.display();
            style.inspire();
            style.express();
            style.preserve();

            System.out.println("--------------------------------------");

            Art art = new Style();
            art.create();
            art.display();
            art.inspire();
            art.express();
            art.preserve();
        }
    }

