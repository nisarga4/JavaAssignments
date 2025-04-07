package com.xworkz.Casting;

public class FurnitureUser {
        public void useFurniture(Furniture furniture) {
            furniture.design();
            furniture.build();
            furniture.paint();
            furniture.polish();
            furniture.move();

            if (furniture instanceof Chair) {
                Chair chair = (Chair) furniture;
                chair.fold();
            }
        }
    }

