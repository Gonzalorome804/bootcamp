package globant.appFarmer.entities.abstracts;

import globant.appFarmer.entities.enums.Gender;
import globant.appFarmer.entities.interfaces.Aquatic;
import globant.appFarmer.entities.interfaces.HumanBeing;
import globant.appFarmer.entities.interfaces.Terrestrial;

public abstract class Human extends Animal<Human> implements HumanBeing<Human> , Terrestrial, Aquatic {

    public Human(Gender gender) {
        super(gender);
    }

    @Override
    public void walk() {
        System.out.println("Mover las piernas");
    }

    @Override
    public void swing() {
        System.out.println("Mover los pies y los brazos");
    }
}
