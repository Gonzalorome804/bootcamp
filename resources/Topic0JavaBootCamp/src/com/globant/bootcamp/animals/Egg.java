package com.globant.bootcamp.animals;

import com.globant.bootcamp.abstracts.Animal;
import com.globant.bootcamp.enums.Color;

public class Egg {

    public Color color;
    public boolean isFertilze = false;

    private Animal baby;

    public Egg(Animal animal, Color color){
        this.baby = animal;
        this.color=color;
    }

    @Override
    public String toString() {
        return  color.getLetter();

    }
}
