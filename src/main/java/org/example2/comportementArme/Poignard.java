package org.example2.comportementArme;

import org.example2.ComportementArme;

public class Poignard implements ComportementArme {

    @Override
    public void utiliseArme() {
        System.out.println("++++++++++ Poignard arme++++++++++");
    }
}
