package com.xworkz.intenal;

import com.xworkz.internal.MusicPlayer;

public class MP3Player implements MusicPlayer {
    public void loadSong() {
        System.out.println("Loading MP3 song...");
    }

    public void playSong() {
        System.out.println("Playing MP3 song...");
    }

    public void stopSong() {
        System.out.println("Stopping MP3 song.");
    }
}
