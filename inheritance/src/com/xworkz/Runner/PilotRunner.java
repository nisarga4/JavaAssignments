package com.xworkz.Runner;

import com.xworkz.Casting.FighterPilot;
import com.xworkz.Casting.FlightMission;
import com.xworkz.Casting.Pilot;

public class PilotRunner {
        public static void main(String[] args) {
            Pilot pilot = new FighterPilot(); // Upcasting
            FlightMission mission = new FlightMission();
            mission.executeMission(pilot); // Safe casting + polymorphism
        }
    }

