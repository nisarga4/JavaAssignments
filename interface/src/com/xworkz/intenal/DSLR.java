
package com.xworkz.intenal;

import com.xworkz.interfacee.Camera;

public class DSLR implements Camera {
    public void open() {
        System.out.println("Opening DSLR camera...");
    }

    public void capture() {
        System.out.println("Capturing photo...");
    }

    public void close() {
        System.out.println("Closing DSLR camera...");
    }
}
