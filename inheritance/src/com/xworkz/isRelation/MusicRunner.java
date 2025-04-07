package com.xworkz.isRelation;
import com.xworkz.inheritance.Music;
import com.xworkz.inheritance.Rhythm;

    public class MusicRunner {
        public static void main(String[] args) {
            Rhythm rhythm = new Rhythm();
            rhythm.play();
            rhythm.pause();
            rhythm.stop();
            rhythm.adjustVolume();
            rhythm.repeat();

            System.out.println("--------------------------------------");

            Music music = new Rhythm();
            music.play();
            music.pause();
            music.stop();
            music.adjustVolume();
            music.repeat();
        }
    }
