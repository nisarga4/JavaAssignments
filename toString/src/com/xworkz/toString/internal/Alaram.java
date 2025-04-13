package com.xworkz.toString.internal;

public class Alaram {
    private String brand;
    private int volume;
    private String soundType;

    public Alaram(String brand, int volume, String soundType) {
        this.brand = brand;
        this.volume = volume;
        this.soundType = soundType;
    }

    @Override
    public String toString() {
        return "Alaram{Brand='" + brand + "', Volume=" + volume + "dB, SoundType='" + soundType + "'}";
    }

    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 197;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Alaram) {
                System.out.println("Ref is Alarm, will compare...");
                Alaram alaram1 = this;
                Alaram alaram2 = (Alaram) obj;
                if (alaram1.brand.equals(alaram2.brand) && alaram1.volume == alaram2.volume && alaram1.soundType.equals(alaram2.soundType)) {
                    System.out.println("Both Alarms are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
