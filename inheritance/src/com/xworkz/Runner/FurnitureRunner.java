package com.xworkz.Runner;

import com.xworkz.Casting.Chair;
import com.xworkz.Casting.Furniture;
import com.xworkz.Casting.FurnitureUser;

public class FurnitureRunner {
        public static void main(String[] args) {
            Furniture furniture = new Chair();
            FurnitureUser user = new FurnitureUser();
            user.useFurniture(furniture);
        }
    }

