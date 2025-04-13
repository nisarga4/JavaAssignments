package com.xworkz.toString.external;

import com.xworkz.toString.internal.Wifi;

public class WifiRunner {
    public static void main(String[] args) {
        Wifi wifi1 = new Wifi("TP-Link", "Router", 300);
        System.out.println(wifi1);

        int hash = wifi1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(wifi1));

        Wifi wifi2 = new Wifi("TP-Link", "Router", 300);
        Wifi wifi3 = new Wifi("D-Link", "Modem", 100);

        System.out.println("Checking same location: " + (wifi1 == wifi2));
        boolean same = wifi1.equals(wifi2);
        System.out.println("WiFi1 is same as WiFi2: " + same);

        System.out.println("WiFi1 is same as WiFi3: " + wifi1.equals(wifi3));
    }
}
