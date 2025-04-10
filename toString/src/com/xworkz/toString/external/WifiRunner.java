package com.xworkz.toString.external;

import com.xworkz.toString.internal.Wifi;

public class WifiRunner {
    public static void main(String[] args) {
        Wifi wifi1 = new Wifi("TP-Link", 100.0, true);
        Wifi wifi2 = new Wifi("Netgear", 150.0, false);

        System.out.println(wifi1);
        System.out.println(wifi2);

        System.out.println("HashCode1: " + wifi1.hashCode());
        System.out.println("HashCode2: " + wifi2.hashCode());
        System.out.println(new Wifi("D-Link", 200.0, true).hashCode());
    }
}
