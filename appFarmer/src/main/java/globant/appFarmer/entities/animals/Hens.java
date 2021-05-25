
package globant.appFarmer.entities.animals;

import globant.appFarmer.entities.abstracts.Bird;
import globant.appFarmer.entities.enums.Color;
import globant.appFarmer.entities.enums.Gender;

public class Hens extends Bird {

    public Color color;

    public Hens(Gender gender, Color color) {
        super(gender);
        this.color = color;
    }
    public Egg obtenerHuevos() { //invoking this function instantiates an egg the same color as the hen
        Egg egg = new Egg(this,color);
        return egg;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void breathe() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

}
