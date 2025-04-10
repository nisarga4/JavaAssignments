package com.xworkz.toString.internal;

public class Alaram {
    private String type;
    private String tone;
    private boolean isVibrating;

    public Alaram(String type, String tone, boolean isVibrating) {
        this.type = type;
        this.tone = tone;
        this.isVibrating = isVibrating;
    }

    @Override
    public String toString() {
        return "Alaram{" +
                "Type='" + type + '\'' +
                ", Tone='" + tone + '\'' +
                ", Vibrating=" + (isVibrating ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80010;
    }
}
