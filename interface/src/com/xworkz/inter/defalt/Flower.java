package com.xworkz.inter.defalt;

public interface Flower {
    void smell();
    void color();
    void type();

    default void gift(){
        System.out.println("gifting roses in default");
    }
    default void fresh(){
        System.out.println("Fresh roses in default");
    }
}
