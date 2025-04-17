package com.xworkz.runner;

import com.xworkz.intenal.DSLR;
import com.xworkz.interfacee.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new DSLR();
        camera.open();
        camera.capture();
        camera.close();
    }
}

