package com.xworkz.Runner;

import com.xworkz.Casting.AdventureLog;
import com.xworkz.Casting.Columbus;
import com.xworkz.Casting.Explorer;

public class ExplorerRunner {
        public static void main(String[] args) {
            Explorer explorer = new Columbus(); // Upcasting
            AdventureLog log = new AdventureLog();
            log.logExplorer(explorer); // Polymorphism and safe casting
        }
    }
