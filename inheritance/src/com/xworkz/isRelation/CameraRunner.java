package com.xworkz.isRelation;

import com.xworkz.inheritance.Lens;
import com.xworkz.inheritance.Camera;

    public class CameraRunner {
        public static void main(String[] args) {
            Lens lens = new Lens();
            lens.powerOn();
            lens.capturePhoto();
            lens.recordVideo();
            lens.zoomIn();
            lens.powerOff();

            System.out.println("--------------------------------------");

            Camera camera = new Lens(); // Polymorphic reference
            camera.powerOn();
            camera.capturePhoto();
            camera.recordVideo();
            camera.zoomIn();
            camera.powerOff();
        }
    }

