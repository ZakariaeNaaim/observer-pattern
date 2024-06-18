package org.example;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl implements Observer {

    private List<Integer> history = new ArrayList<Integer>();

    @Override
    public void update(int etat) {
        System.out.println("--------------------- Observer Impl -------------------");
        history.add(etat);
        double sum = 0;
        for (Integer i : history) {
            sum  += i;
        }
        System.out.println("Stage AVG =>" + sum/history.size());
        System.out.println("----------------------------------");
    }
}
