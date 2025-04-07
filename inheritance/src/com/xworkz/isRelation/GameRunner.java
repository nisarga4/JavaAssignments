package com.xworkz.isRelation;
import com.xworkz.inheritance.Game;
import com.xworkz.inheritance.Level;

    public class GameRunner {
        public static void main(String[] args) {
            Level level = new Level();
            level.start();
            level.play();
            level.pause();
            level.save();
            level.end();

            System.out.println("--------------------------------------");

            Game game = new Level();
            game.start();
            game.play();
            game.pause();
            game.save();
            game.end();
        }
    }


