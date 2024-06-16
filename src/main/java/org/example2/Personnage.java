package org.example2;

public class Personnage {
    private ComportementArme arme;
    private ComportementCombattre combattre;

    public void combattre() {
        System.out.println("********************");
        arme.utiliseArme();
        combattre.combattre();
        System.out.println("===================");
    }
    public void setArme(ComportementArme arme) {
        this.arme = arme;
    }
    public void setCombattre(ComportementCombattre combattre) { this.combattre = combattre; }
}
