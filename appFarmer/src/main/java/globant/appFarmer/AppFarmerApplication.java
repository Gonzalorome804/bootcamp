package globant.appFarmer;
import com.sun.tools.javac.Main;
import globant.appFarmer.entities.Farmer;
import globant.appFarmer.entities.abstracts.Animal;
import globant.appFarmer.entities.animals.*;
import globant.appFarmer.entities.enums.Gender;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppFarmerApplication {
	private static Logger logger = Logger.getLogger(AppFarmerApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(AppFarmerApplication.class, args);


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

		AppFarmerApplication.singAnimals(animals);
	}
		private static void singAnimals (Animal[]animalBox){
			for (Animal animal : animalBox) {
				animal.makeSound();
				System.out.println(animal.getGender());
				System.out.println("-----------------");
			}


			logger.info("\n" + "starting application from main");
			// HenHouse henHouse= HenHouse.getInstance();//in this way it will invoke the function to perform a single instance
			HenHouse henHouse = new HenHouse();
			Farmer farmer = new Farmer(henHouse.henses);
			farmer.gatherEggs();
			farmer.fillinBox();
			farmer.showBoxes();

		}

}