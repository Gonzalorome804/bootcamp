package globant.appFarmer.entities.animals;

import globant.appFarmer.entities.enums.Color;
import globant.appFarmer.entities.enums.Gender;
import globant.appFarmer.entities.abstracts.Bird;
import globant.appFarmer.entities.interfaces.Aquatic;

public class Duck extends Bird implements Aquatic {

    public Duck(Gender gender) {
        super(gender);
    }

    @Override
    public void swing() {

    }

    @Override
    public void walk() {

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
    public Egg gaveBirth() {
        return new Egg(new Duck(Gender.MALE), Color.WHITE);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack Quack Quack...");
    }
}
