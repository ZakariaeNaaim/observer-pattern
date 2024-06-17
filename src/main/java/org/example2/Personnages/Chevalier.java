package org.example2.Personnages;

public class Chevalier extends Personnage {

    @Override
    public void combattre() {
        System.out.println("++++++++++ Chevalier combattre++++++++++");
        arme.utiliseArme();
    }
}
