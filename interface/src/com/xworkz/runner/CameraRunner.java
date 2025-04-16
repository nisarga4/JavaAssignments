package com.xworkz.runner;

import com.xworkz.interfacee.DSLR;
import com.xworkz.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new DSLR();
        camera.open();
        camera.capture();
        camera.close();
    }
}
