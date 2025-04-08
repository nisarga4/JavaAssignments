package com.xworkz.Casting;

    public class FlightMission {
        public void executeMission(Pilot pilot) {
            pilot.startEngine();
            pilot.takeOff();
            pilot.navigate();
            pilot.land();
            pilot.communicate();

            if (pilot instanceof FighterPilot) {
                FighterPilot fighter = (FighterPilot) pilot;
                fighter.engageEnemy(); // Unique method
            }
        }
    }
