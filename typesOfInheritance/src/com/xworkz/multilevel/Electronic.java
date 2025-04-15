package com.xworkz.multilevel;
class Electronic {
    void powerOn() {
        System.out.println("Electronic device is powered on.");
    }
}

class Phone extends Electronic {
    void call() {
        System.out.println("Phone is making a call.");
    }
}

class SmartPhone extends Phone {
    void browseInternet() {
        System.out.println("SmartPhone is browsing the internet.");
    }
}
