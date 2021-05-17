package com.globant.bootcamp.animals;

import com.globant.bootcamp.enums.Color;
import com.globant.bootcamp.enums.Gender;

public class HenHouse {
    private static HenHouse instance;
    private final static int SIZE=40;
    public Hens[] henses;

    public HenHouse() {//using this constructor creates a array of henses
        this.henses = new Hens[SIZE];
        for (int i = 0; i < (SIZE * 0.7); i++) { //traversing to 70% of the size
            this.henses[i] = new Hens(Gender.FEMALE, Color.RED);
        }
        for (int i = (int)(SIZE * 0.7); i < SIZE; i++) {//traversing to 30% final of the size
            this.henses[i] = new Hens(Gender.FEMALE, Color.WHITE);
        }
    }
    /*public static HenHouse getInstance(){ //the "singleton" pattern is applied
        if (instance== null){
            instance = new HenHouse();
        }
        return instance;
    }*/
}
