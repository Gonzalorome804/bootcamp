package globant.appFarmer;
import globant.appFarmer.entities.Farmer;
import globant.appFarmer.entities.animals.HenHouse;
import globant.appFarmer.entities.enums.Gender;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppFarmerApplicationTests {
	static HenHouse henHouse;
	static Farmer farmer;

	@BeforeClass
	public static void beforeClass() {
		henHouse = new HenHouse();
		farmer = new Farmer(henHouse.henses);

	}

	@Before
	public void before() {
		farmer.gatherEggs(); //is always called before each method as they all need
	}

	@org.junit.Test
	public void numEggs() {
		Assertions.assertEquals(80, farmer.eggs.length); //check that the size of the eggs array is 80
	}

	@org.junit.Test
	public void genderHen() {
		for (int i = 0; i < henHouse.henses.length; i++) {
			Assertions.assertEquals(Gender.FEMALE, henHouse.henses[i].getGender());//check that the hens that lay eggs are female
		}
	}

	@org.junit.Test
	public void eggsFull() {
		for (int i = 0; i < farmer.eggs.length; i++) {
			Assertions.assertNotNull(farmer.eggs[i]); //check that the eggs array is full
		}
	}

	@org.junit.Test
	public void eggsEmpty() {
		farmer.fillinBox();// the carton boxes are filled with eggs
		for (int i = 0; i < farmer.eggs.length; i++) {
			Assertions.assertNull(farmer.eggs[i]);//check that the eggs array is empty
		}
	}

	@org.junit.Test
	public void coloCarton() {
		farmer.fillinBox();
		farmer.cartonBoxes.forEach(maple -> {
			;

			for (int i = 0; i < maple.ability.length; i++) {
				if (maple.ability[i] != null) {

					assert maple.ability[0] != null;
					Assertions.assertEquals(maple.ability[0].color, maple.ability[i].color);//check that all the eggs in each carton box have the same color
				}
			}
		});

	}
	@Test
	void contextLoads() {
	}

}
