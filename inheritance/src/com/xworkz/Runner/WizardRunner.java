package com.xworkz.Runner;

import com.xworkz.Casting.HarryPotter;
import com.xworkz.Casting.Wizard;
import com.xworkz.Casting.WizardHandler;

public class WizardRunner {

        public static void main(String[] args) {
            Wizard wizard = new HarryPotter(); // Upcasting
            WizardHandler handler = new WizardHandler();
            handler.handleWizard(wizard); // Dynamic method dispatch + safe casting
        }
    }
