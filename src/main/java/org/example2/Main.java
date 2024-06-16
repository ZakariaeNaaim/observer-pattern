package org.example2;

import org.example2.Personnages.Troll;
import org.example2.comportementArme.Hache;


public class Main {
    public static void main(String[] args) throws Exception {
       Personnage personnage=new Personnage();
        ComportementArme armeStrategy = new Hache();
        ComportementCombattre combattreStrategy=new Troll();
        personnage.setArme(armeStrategy);
        personnage.setCombattre(combattreStrategy);
        personnage.combattre();
       }
}