package com.xworkz.Runner;

import com.xworkz.Casting.Juice;
import com.xworkz.Casting.JuiceMaker;
import com.xworkz.Casting.OrangeJuice;

public class JuiceMain {
        public static void main(String[] args) {
            Juice juice = new OrangeJuice(); // Upcasting
            JuiceMaker maker = new JuiceMaker();
            maker.prepareJuice(juice);
        }
    }

