package globant.appFarmer.entities.animals;

import globant.appFarmer.entities.abstracts.Animal;
import globant.appFarmer.entities.enums.Color;

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
