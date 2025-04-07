package com.xworkz.isRelation;
import com.xworkz.inheritance.Heart;
import com.xworkz.inheritance.Emotion;

    public class HeartRunner {
        public static void main(String[] args) {
            Emotion emotion = new Emotion();
            emotion.beat();
            emotion.pumpBlood();
            emotion.react();
            emotion.feel();
            emotion.rest();

            System.out.println("--------------------------------------");

            Heart heart = new Emotion();
            heart.beat();
            heart.pumpBlood();
            heart.react();
            heart.feel();
            heart.rest();
        }
    }
