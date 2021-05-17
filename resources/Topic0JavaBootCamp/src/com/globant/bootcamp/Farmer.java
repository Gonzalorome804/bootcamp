package com.globant.bootcamp;

import com.globant.bootcamp.animals.Egg;
import com.globant.bootcamp.animals.Hens;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Farmer {

    private static final Logger logger = Logger.getLogger(Farmer.class.getName());

    public List<CartonBox> cartonBoxes = new ArrayList<>();
    public Hens[] henses;
    public Egg[] eggs;

    public Farmer(Hens[] henses) {
        this.henses = henses;
        this.eggs = new Egg[henses.length * 2];
    }

    public void gatherEggs() {
        for (int i = 0; i < henses.length; i++) {
            for (int j = 0; j < 2; j++) {
                eggs[i * 2 + j] = henses[i].obtenerHuevos();// each hen instantiates two eggs and is added to the array "eggs"
            }
        }

    }

    public void fillinBox() {
        CartonBox cartonBox = new CartonBox(eggs[0].color);//a cartonBox of the color of the first egg is created.

        for (int j = 0; j < eggs.length; j++) {

            if (cartonBox.addEggs(eggs[j])) {
                eggs[j] = null;//if it could be added, we empty that position of the array

            } else { // if addEggs return false
                cartonBoxes.add(cartonBox);//"cartonBox" is added to the list
                cartonBox = new CartonBox(eggs[j].color);//a new one is created with the color of the egg in that position in the array
                cartonBox.addEggs(eggs[j]); // invoke the function, passing it as a parameter an egg of the respective position of the array
                eggs[j] = null;
            }

        }
        cartonBoxes.add(cartonBox);//the last "cartonBox" by not entering the else, must also be added to the list
    }

    public void showBoxes() {//the "cartonBoxes" list is printed
        cartonBoxes.forEach(maple -> {
            logger.info("\n" + maple.toString());
        });
    }

}
