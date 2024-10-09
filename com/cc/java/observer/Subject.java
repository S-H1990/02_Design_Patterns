package com.cc.java.observer;


import java.util.ArrayList;
import java.util.List;

import com.cc.java.tools.Helper;

public class Subject implements Observable{

    private String state;
     private List<Observer> observers = new ArrayList<>();

//registeratinon interface
    @Override
    public void attach(Observer o) {
       
        observers.add(o);   //lasst ein Abo da
    }
    //deregisteratinon interface
    @Override
    public void detatch(Observer o) {
       
        observers.remove(o);
    }
    // Notification interface(), sagt bescheid
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
        // o.update(); //pull
        o.update(state); //push
       }
    }
    // Observer holen sich den neuen Status
    public String getState() {
        return state;
    }
    // Subjekt ändert seinen Status/Post-Video-Beitrag
    public void setState(String state) {
        this.state = state;
        Helper.output("The Subjects state is now: " + state);
        notifyObservers();
    }
   

}
