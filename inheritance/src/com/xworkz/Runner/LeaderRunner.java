package com.xworkz.Runner;

import com.xworkz.Casting.Gandhi;
import com.xworkz.Casting.Leader;
import com.xworkz.Casting.Supporter;

public class LeaderRunner {
        public static void main(String[] args) {
            Leader leader = new Gandhi(); // Upcasting
            Supporter supporter = new Supporter();
            supporter.followLeader(leader);
        }
    }

