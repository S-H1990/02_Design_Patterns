package com.cc.java.observer;

import com.cc.java.tools.Helper;

public class App {

    public static void main(String[] args) {
        
        Subject s = new Subject();
        Subscriber sub1 = new Subscriber(s, "Bob");
        Subscriber sub2 = new Subscriber(s, "Alice");


        s.setState("Neuer Post auf IG");
        Helper.output("---------------");
        s.setState("Neuer Live-Stream ");
        Helper.output("---------------");


        // FOMO ???
        Subscriber sub3 = new Subscriber(s, "Marco");
        s.setState("Neuer Post über Solana");
        Helper.output("---------------");
        s.detatch(sub2);  


        s.setState("Neuer Post über Polkadot");
        Helper.output("---------------");



    }
}
