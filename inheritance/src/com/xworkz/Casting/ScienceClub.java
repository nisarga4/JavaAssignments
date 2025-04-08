package com.xworkz.Casting;

    public class ScienceClub {
        public void inviteScientist(Scientist scientist) {
            scientist.research();
            scientist.experiment();
            scientist.publishPaper();
            scientist.attendConference();
            scientist.mentorStudents();

            if (scientist instanceof Newton) {
                Newton newton = (Newton) scientist;
                newton.discoverGravity(); // unique method
            }
        }
    }
