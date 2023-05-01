package com.rizvi.inhertance;

import javax.swing.*;

public class Fish implements Predator, Prey {


    @Override
    public void hunt() {
        System.out.println("This Fish is hunting smaller fISH");
    }

    @Override
    public void flee() {
        System.out.println("This Fish Flees from larger fISH");
    }

}