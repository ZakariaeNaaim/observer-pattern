package org.example2.Personnages;

public class Roi  extends Personnage {

    @Override
    public void combattre() {
        System.out.println("++++++++++ Roi combattre++++++++++");
        arme.utiliseArme();
    }
}
