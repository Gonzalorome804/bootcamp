import com.globant.bootcamp.Farmer;
import com.globant.bootcamp.abstracts.Animal;
import com.globant.bootcamp.animals.*;
import com.globant.bootcamp.enums.Gender;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        Chicken gallina = new Chicken(Gender.FEMALE);
        gallina.makeSound();

        Duck pato = new Duck(Gender.MALE);

        Dog doggo = new Dog(Gender.MALE);

        Cat cat = new Cat(Gender.FEMALE);

        animals[0] = gallina;
        animals[1] = pato;
        animals[2] = doggo;
        animals[3] = cat;

        Main.singAnimals(animals);
    }

    private static void singAnimals(Animal[] animalBox){
        for(Animal animal : animalBox){
            animal.makeSound();
            System.out.println(animal.getGender());
            System.out.println("-----------------");
        }

        HenHouse henHouse= HenHouse.getInstance();//in this way it will invoke the function to perform a single instance
        Farmer farmer = new Farmer(henHouse.henses);
        farmer.gatherEggs();
        farmer.fillinBox();
        farmer.showBoxes();

    }


}

