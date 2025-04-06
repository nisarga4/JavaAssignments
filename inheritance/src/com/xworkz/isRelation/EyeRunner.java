package com.xworkz.isRelation;
import com.xworkz.inheritance.Eye;
import com.xworkz.inheritance.Vision;

    public class EyeRunner {
        public static void main(String[] args) {
            Vision vision = new Vision();
            vision.see();
            vision.blink();
            vision.focus();
            vision.senseLight();
            vision.tearUp();

            System.out.println("--------------------------------------");

            Eye eye = new Vision(); // Polymorphic reference
            eye.see();
            eye.blink();
            eye.focus();
            eye.senseLight();
            eye.tearUp();
        }
    }
