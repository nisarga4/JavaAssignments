package com.xworkz.inheritance;

public class Roof extends House {

    @Override
    public void build() {
        super.build();
        System.out.println("Running build in Roof");
    }

    @Override
    public void paint() {
        super.paint();
        System.out.println("Running paint in Roof");
    }

    @Override
    public void lockDoors() {
        super.lockDoors();
        System.out.println("Running lockDoors in Roof");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean in Roof");
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("Running decorate in Roof");
    }
}

