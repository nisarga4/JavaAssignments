package com.xworkz.isRelation;

import com.xworkz.inheritance.Dance;
import com.xworkz.inheritance.Move;

    public class DanceRunner {
        public static void main(String[] args) {
            Move move = new Move();
            move.start();
            move.perform();
            move.practice();
            move.express();
            move.end();

            System.out.println("--------------------------------------");

            Dance dance = new Move();
            dance.start();
            dance.perform();
            dance.practice();
            dance.express();
            dance.end();
        }
    }
