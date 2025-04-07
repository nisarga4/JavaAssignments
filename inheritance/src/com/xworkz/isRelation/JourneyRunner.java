package com.xworkz.isRelation;
import com.xworkz.inheritance.Journey;
import com.xworkz.inheritance.Destination;

    public class JourneyRunner {
        public static void main(String[] args) {
            Destination destination = new Destination();
            destination.begin();
            destination.travel();
            destination.explore();
            destination.faceChallenges();
            destination.conclude();

            System.out.println("--------------------------------------");

            Journey journey = new Destination();
            journey.begin();
            journey.travel();
            journey.explore();
            journey.faceChallenges();
            journey.conclude();
        }
    }
