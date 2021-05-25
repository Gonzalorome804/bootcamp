package globant.appFarmer.entities.animals;

import globant.appFarmer.entities.enums.Gender;
import globant.appFarmer.entities.abstracts.Bird;

public class Chicken extends Bird {

    public Chicken(Gender gender) {
        super(gender);
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

    @Override
    public void fly() {
        System.out.println("Mover alitas hasta 15cms");
    }

    @Override
    public void makeSound() {
        System.out.println("Pio Pio");
    }
}
