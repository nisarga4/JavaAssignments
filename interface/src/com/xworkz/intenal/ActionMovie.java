package com.xworkz.intenal;
import com.xworkz.interfacee.Movie;

public class ActionMovie implements Movie {
        public void play() {
            System.out.println("Playing the action movie.");
        }

        public void pause() {
            System.out.println("Pausing the action movie.");
        }

        public void stop() {
            System.out.println("Stopping the action movie.");
        }
    }
