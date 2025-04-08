package com.xworkz.Casting;

    public class FighterPilot extends Pilot {

        @Override
        public void startEngine() {
            System.out.println("FighterPilot starts the jet engine with full power...");
        }

        @Override
        public void takeOff() {
            System.out.println("FighterPilot performs a rapid vertical takeoff...");
        }

        @Override
        public void navigate() {
            System.out.println("FighterPilot navigates at supersonic speed...");
        }

        @Override
        public void land() {
            System.out.println("FighterPilot lands using arrestor hook...");
        }

        @Override
        public void communicate() {
            System.out.println("FighterPilot communicates in military code...");
        }

        public void engageEnemy() {
            System.out.println("FighterPilot is engaging enemy targets!");
        }
    }
