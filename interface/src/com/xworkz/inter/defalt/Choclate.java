package com.xworkz.inter.defalt;

public interface Choclate {
    void flavor();
    void price();
    void shape();

    default void gift(){
        System.out.println("gifting choclate in gift");
    }
    default void brand(){
        System.out.println("cadboury brand");
    }
}
