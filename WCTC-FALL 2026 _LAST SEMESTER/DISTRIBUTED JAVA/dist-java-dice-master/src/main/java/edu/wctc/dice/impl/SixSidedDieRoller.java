package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;

import java.util.Random;

public class SixSidedDieRoller implements  DieRoller{

    private Random random = new Random();

    @Override
    public int roll(){
        return random.nextInt(6) + 1;
    }
}