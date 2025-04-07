package com.xworkz.isRelation;
import com.xworkz.inheritance.App;
import com.xworkz.inheritance.Feature;

    public class AppRunner {
        public static void main(String[] args) {
            Feature feature = new Feature();
            feature.launch();
            feature.update();
            feature.install();
            feature.rate();
            feature.uninstall();

            System.out.println("--------------------------------------");

            App app = new Feature();
            app.launch();
            app.update();
            app.install();
            app.rate();
            app.uninstall();
        }
    }
