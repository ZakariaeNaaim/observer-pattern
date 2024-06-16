package org.example2.Personnages;

import org.example2.ComportementCombattre;

public class Troll  implements ComportementCombattre {

    @Override
    public void combattre() {
        System.out.println("++++++++++ Troll combattre++++++++++");
    }
}
