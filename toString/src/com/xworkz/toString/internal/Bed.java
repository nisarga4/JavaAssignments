package com.xworkz.toString.internal;

public class Bed {
    private String size;
    private String material;
    private boolean storageAvailable;

    public Bed(String size, String material, boolean storageAvailable) {
        this.size = size;
        this.material = material;
        this.storageAvailable = storageAvailable;
    }

    @Override
    public String toString() {
        return "Bed{Size='" + size + "', Material='" + material + "', StorageAvailable=" + storageAvailable + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 555;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bed) {
                System.out.println("Ref is Bed, will compare...");
                Bed bed1 = this;
                Bed bed2 = (Bed) obj;
                if (bed1.size.equals(bed2.size) &&
                        bed1.material.equals(bed2.material) &&
                        bed1.storageAvailable == bed2.storageAvailable) {
                    System.out.println("Both beds are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
