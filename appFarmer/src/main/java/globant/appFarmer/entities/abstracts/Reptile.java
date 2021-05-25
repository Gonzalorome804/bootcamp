package globant.appFarmer.entities.abstracts;

import globant.appFarmer.entities.enums.Gender;
import globant.appFarmer.entities.animals.Egg;
import globant.appFarmer.entities.interfaces.Terrestrial;

public abstract class Reptile extends Animal<Egg> {

    public Reptile(Gender gender) {
        super(gender);
    }
}
