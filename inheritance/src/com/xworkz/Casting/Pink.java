package com.xworkz.Casting;

    public class Pink {

        public void useColor(Color color) {
            color.mix();
            color.apply();
            color.shade();
            color.dry();
            color.brighten();

            if (color instanceof Green) {
                Green green = (Green) color;
                green.blendWithNature();
            }
        }
    }
