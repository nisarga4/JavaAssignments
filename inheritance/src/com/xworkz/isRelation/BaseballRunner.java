package com.xworkz.isRelation;


import com.xworkz.inheritance.Bat;
import com.xworkz.inheritance.Baseball;

    public class BaseballRunner {
        public static void main(String[] args) {
            Bat bat = new Bat();
            bat.pitch();
            bat.catchBall();
            bat.throwBall();
            bat.warmUp();
            bat.play();

            System.out.println("--------------------------------------");

            Baseball baseball = new Bat(); // Polymorphic reference
            baseball.pitch();
            baseball.catchBall();
            baseball.throwBall();
            baseball.warmUp();
            baseball.play();
        }
    }

