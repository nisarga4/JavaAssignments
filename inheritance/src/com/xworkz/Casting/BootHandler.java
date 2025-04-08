package com.xworkz.Casting;
    public class BootHandler {

        public void useBoot(Boot boot) {
            boot.wear();
            boot.remove();
            boot.clean();
            boot.polish();
            boot.store();

            if (boot instanceof WinterBoot) {
                WinterBoot winterBoot = (WinterBoot) boot;
                winterBoot.useInSnow();
            }
        }
    }
