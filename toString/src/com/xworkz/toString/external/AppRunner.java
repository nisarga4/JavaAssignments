package com.xworkz.toString.external;

import com.xworkz.toString.internal.App;

public class AppRunner {
    public static void main(String[] args) {
        App app1 = new App("WhatsApp", 2.23, "Meta");
        App app2 = new App("Snapchat", 12.5, "Snap Inc");

        System.out.println(app1);
        System.out.println(app2);

        int code1 = app1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = app2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new App("Telegram", 10.1, "Telegram FZ-LLC").hashCode());
    }
}
