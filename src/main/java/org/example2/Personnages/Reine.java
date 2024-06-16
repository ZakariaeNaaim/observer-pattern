package org.example2.Personnages;

import org.example2.ComportementCombattre;

public class Reine implements ComportementCombattre {

    @Override
    public void combattre() {
        System.out.println("++++++++++ Reine combattre++++++++++");
    }
}
