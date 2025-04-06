package com.xworkz.isRelation;
import com.xworkz.inheritance.Phone;
import com.xworkz.inheritance.Screen;

    public class PhoneRunner {
        public static void main(String[] args) {
            Screen screen = new Screen();
            screen.call();
            screen.text();
            screen.browse();
            screen.takePhoto();
            screen.charge();

            System.out.println("--------------------------------------");

            Phone phone = new Screen(); // Polymorphic reference
            phone.call();
            phone.text();
            phone.browse();
            phone.takePhoto();
            phone.charge();
        }
    }


