package org.example2;

import org.example2.Personnages.Chevalier;
import org.example2.Personnages.Personnage;
import org.example2.Personnages.Roi;
import org.example2.Strategie.ArcEtFleches;
import org.example2.Strategie.ComportementArme;
import org.example2.Strategie.Hache;


public class Main {
    public static void main(String[] args) throws Exception {
       Personnage personnage=new Chevalier();
        ComportementArme armeStrategy = new Hache();
        personnage.setArme(armeStrategy);
        personnage.combattre();

        Personnage roi=new Roi();
        ComportementArme armeArcStrategy = new ArcEtFleches();
        roi.setArme(armeArcStrategy);
        roi.combattre();
       }
}