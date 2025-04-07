package com.xworkz.Casting;

    public class Manager {

        public void manageCelebrity(Anushka person) {
            person.act();
            person.endorse();
            person.attendEvents();
            person.giveInterview();
            person.travel();

            if (person instanceof Virat) {
                Virat virat = (Virat) person;
                virat.playCricket();
            }
        }
    }
