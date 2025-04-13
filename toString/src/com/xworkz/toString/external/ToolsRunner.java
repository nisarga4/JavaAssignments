package com.xworkz.toString.external;

import com.xworkz.toString.internal.Tools;

public class ToolsRunner {
    public static void main(String[] args) {
        Tools tool1 = new Tools("Hammer", "Steel", 15.99);
        System.out.println(tool1);

        int hash = tool1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(tool1));

        Tools tool2 = new Tools("Hammer", "Steel", 15.99);
        Tools tool3 = new Tools("Wrench", "Steel", 9.99);

        System.out.println("Checking same location: " + (tool1 == tool2));
        boolean same = tool1.equals(tool2);
        System.out.println("Tool1 is same as Tool2: " + same);

        boolean sameTool3 = tool1.equals(tool3);
        System.out.println("Tool1 is same as Tool3: " + sameTool3);
    }
}
