package com.xworkz.Casting;

public class WizardHandler {

        public void handleWizard(Wizard wizard) {
            wizard.castSpell();
            wizard.brewPotion();
            wizard.rideBroom();
            wizard.useWand();
            wizard.studyMagic();

            if (wizard instanceof HarryPotter) {
                HarryPotter harry = (HarryPotter) wizard;
                harry.summonPatronus();
            }
        }
    }
