package com.xworkz.Casting;

    public class AdventureLog {
        public void logExplorer(Explorer explorer) {
            explorer.explore();
            explorer.navigate();
            explorer.recordJourney();
            explorer.gatherResources();
            explorer.meetLocals();

            if (explorer instanceof Columbus) {
                Columbus columbus = (Columbus) explorer;
                columbus.discoverAmerica(); // Unique method
            }
        }
    }
