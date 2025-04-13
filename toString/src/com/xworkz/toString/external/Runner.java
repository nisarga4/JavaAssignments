package com.xworkz.toString.external;

import com.xworkz.toString.internal.Bottel;

public class Runner {
    public static void main(String[]args){
        Bottel bottle1 = new Bottel("Milton", "Blue", 1000, 299);
        Bottel bottle2 = new Bottel("Milton", "Green", 1000, 299);
        Bottel bottle3 = new Bottel("Cello", "Red", 1200, 349);
        bottle1.equals(bottle2);
        bottle2.equals(bottle3);
    }
}
