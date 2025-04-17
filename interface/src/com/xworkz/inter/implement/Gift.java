package com.xworkz.inter.implement;

import com.xworkz.inter.defalt.Choclate;
import com.xworkz.inter.defalt.Flower;

public class Gift implements Choclate, Flower {

    @Override
    public void flavor() {
        System.out.println("running milk");
    }

    @Override
    public void price() {
        System.out.println("running prce");
    }

    @Override
    public void shape() {
        System.out.println("running shape");
    }

    @Override
    public void smell() {
        System.out.println("running smell");
    }

    @Override
    public void color() {
        System.out.println("running color");
    }

    @Override
    public void type() {
        System.out.println("running type");
    }
}
