package com.xworkz.runner;

import com.xworkz.interfacee.MP3Player;
import com.xworkz.internal.MusicPlayer;

public class MusicPlayerRunner {
    public static void main(String[] args) {
        MusicPlayer player = new MP3Player();
        player.loadSong();
        player.playSong();
        player.stopSong();
    }
}
