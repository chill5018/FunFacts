package com.colinwhill.funfacts.app;

import java.util.Random;

/**
 * Created by colinhill on 11/23/15.
 */
public class FactBook {

    public String getFact(){

        String fact = "";

        String[] facts = {"Ants stretch when they wake up in the morning.",
                "Ostriches run faster than horses.",
                "The earth spins at 1000 MPH at the equator",
                "Android development can be annoying",
                "The distance from Oslo to the Northern most distance of Norway is the same distance as Oslo to Rome.",
                "The faster you move, the more you slow down time.",
                "Lossless quality is better than MP3 quality.",
                "Steve Jobs was actually a terrible person",
                "Bill Gates will not leave any money to his children.",
                "Mark Zuckerburg created Facebook in a Dorm Room at Harvard"};


        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(facts.length);

        return facts[randomNum];


    }
}
