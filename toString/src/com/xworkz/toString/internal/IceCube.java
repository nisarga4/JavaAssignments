package com.xworkz.toString.internal;

public class IceCube {
    private String shape;
    private double size;
    private String source;

    public IceCube(String shape, double size, String source) {
        this.shape = shape;
        this.size = size;
        this.source = source;
    }

    @Override
    public String toString() {
        return "IceCube{Shape='" + shape + "', Size=" + size + "cm, Source='" + source + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof IceCube) {
                IceCube iceCube1 = this;
                IceCube iceCube2 = (IceCube) obj;
                if (iceCube1.shape.equals(iceCube2.shape) && iceCube1.size == iceCube2.size && iceCube1.source.equals(iceCube2.source)) {
                    return true;
                }
            }
        }
        return false;
    }
}
