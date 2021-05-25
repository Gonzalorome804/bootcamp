package globant.appFarmer.entities;

import globant.appFarmer.entities.animals.Egg;
import globant.appFarmer.entities.enums.Color;

public class CartonBox {
    Color color;
    public Egg[] ability = new Egg[30];

    public CartonBox(Color color) {
        this.color = color;
    }

    public boolean addEggs(Egg egg) { //receive an egg as a parameter and returns a true or false
        int n = ability.length;
        for (int i = 0; i < n; i++) {
            if (ability[i] == null && egg.color == color) { //if the "ability" position is empty and the egg is the same color as the "cartonBox"
                ability[i] = egg;//add the egg to the array
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() { //print the "ability" appropriate form
        String neatBox = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (ability[i * 5 + j] != null) {
                    neatBox += "(" + color.getLetter() + ")";
                } else {
                    neatBox += "(G)";
                }

            }
            neatBox += "\n";
        }
        return neatBox;
    }
}

