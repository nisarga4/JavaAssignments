package com.xworkz.inter.main;

import com.xworkz.inter.defalt.Choclate;
import com.xworkz.inter.defalt.Flower;
import com.xworkz.inter.implement.Gift;

public class GiftRunner {
    public static void main(String[] args) {
        Choclate choclate=new Gift();
        choclate.brand();
        choclate.flavor();
        choclate.price();
        choclate.shape();
        choclate.gift();

        Flower flower=new Gift();
        flower.color();
        flower.fresh();
        flower.smell();
        flower.type();
        flower.gift();

    }
}
