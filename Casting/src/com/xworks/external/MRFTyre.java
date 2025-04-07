package com.xworks.external;

public class MRFTyre extends Tyre{

        @Override
        public void expand() {
            super.expand();
            System.out.println("Running exapand  in Tyre");
        }
}
