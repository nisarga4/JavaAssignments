package com.xworkz.hybridlevel;
class Media {
    void playMedia() {
        System.out.println("Playing media...");
    }
}

class VideoPlayer extends Media {
    void adjustQuality() {
        System.out.println("Adjusting video quality.");
    }
}

interface SubtitleSupport {
    void loadSubtitles();
}

class SmartPlayer extends VideoPlayer implements SubtitleSupport {
    public void loadSubtitles() {
        System.out.println("Subtitles loaded.");
    }
}

