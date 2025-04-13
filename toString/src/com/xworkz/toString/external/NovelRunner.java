package com.xworkz.toString.external;

import com.xworkz.toString.internal.Novel;

public class NovelRunner {
    public static void main(String[] args) {
        Novel novel1 = new Novel("1984", "George Orwell", 328);
        System.out.println(novel1);

        int hash = novel1.hashCode();
        System.out.println("Hash Code: " + hash);

        Novel novel2 = new Novel("1984", "George Orwell", 328);
        Novel novel3 = new Novel("Brave New World", "Aldous Huxley", 311);

        System.out.println("Checking same location: " + (novel1 == novel2));
        boolean same = novel1.equals(novel2);
        System.out.println("Novel1 is same as Novel2: " + same);

        boolean different = novel1.equals(novel3);
        System.out.println("Novel1 is same as Novel3: " + different);
    }
}
