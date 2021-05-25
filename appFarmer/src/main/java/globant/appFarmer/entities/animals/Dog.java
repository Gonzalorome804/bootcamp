package globant.appFarmer.entities.animals;

import globant.appFarmer.entities.enums.Gender;
import globant.appFarmer.entities.abstracts.Animal;
import globant.appFarmer.entities.interfaces.Terrestrial;

public class Dog extends Animal<Dog> implements Terrestrial {

    public Dog(Gender gender) {
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
    public Dog gaveBirth() {
        return null;
    }

    @Override
    public void walk() {

    }

    @Override
    public void makeSound() {
        System.out.println("Guauuu Guauuuu...");
    }
}
