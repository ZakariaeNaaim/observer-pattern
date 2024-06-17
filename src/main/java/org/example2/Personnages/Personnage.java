package org.example2.Personnages;

import org.example2.Strategie.ComportementArme;

public abstract class Personnage {
    public ComportementArme arme;

    public abstract void combattre();
    public void setArme(ComportementArme arme) {
        this.arme = arme;
    }
}
