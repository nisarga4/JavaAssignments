package com.xworks.external;

public class Tyre extends Rubber{
        @Override
        public void expand() {
            super.expand();
            System.out.println("Running exapand  in Tyre");
        }
    }
