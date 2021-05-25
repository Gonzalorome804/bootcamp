package globant.appFarmer.entities.abstracts;

import globant.appFarmer.entities.animals.Chicken;
import globant.appFarmer.entities.enums.Color;
import globant.appFarmer.entities.enums.Gender;
import globant.appFarmer.entities.animals.Egg;
import globant.appFarmer.entities.interfaces.Aerial;
import globant.appFarmer.entities.interfaces.Terrestrial;

public abstract class Bird extends Animal<Egg> implements Aerial, Terrestrial {

    public Bird(Gender gender) {
        super(gender);
    }

    @Override
    public void fly() {
        System.out.println("Mover alitas e ir al cielo");
    }

    @Override
    public void walk() {
        System.out.println("Mover patitas");
    }

    @Override
    public Egg gaveBirth() {
        if(this.gender == Gender.FEMALE)
            return new Egg(new Chicken(Animal.randomGender()), Color.WHITE);
        else
            return null;
    }

}
