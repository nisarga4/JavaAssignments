package com.xworkz.isRelation;

import com.xworkz.inheritance.Curtain;
import com.xworkz.inheritance.Window;

    public class WindowRunner {
        public static void main(String[] args) {
            Curtain curtain = new Curtain();
            curtain.open();
            curtain.close();
            curtain.lock();
            curtain.unlock();
            curtain.clean();

            System.out.println("--------------------------------------");

            Window window = new Curtain(); // Polymorphic reference
            window.open();
            window.close();
            window.lock();
            window.unlock();
            window.clean();
        }
    }