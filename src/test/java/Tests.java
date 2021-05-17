import com.globant.bootcamp.Farmer;
import com.globant.bootcamp.animals.HenHouse;
import com.globant.bootcamp.enums.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tests {
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

    @Test
    public void numEggs() {
        Assert.assertEquals(80, farmer.eggs.length); //check that the size of the eggs array is 80
    }

    @Test
    public void genderHen() {
        for (int i = 0; i < henHouse.henses.length; i++) {
            Assert.assertEquals(Gender.FEMALE, henHouse.henses[i].getGender());//check that the hens that lay eggs are female
        }
    }

    @Test
    public void eggsFull() {
        for (int i = 0; i < farmer.eggs.length; i++) {
            Assert.assertNotNull(farmer.eggs[i]); //check that the eggs array is full
        }
    }

    @Test
    public void eggsEmpty() {
        farmer.fillinBox();// the carton boxes are filled with eggs
        for (int i = 0; i < farmer.eggs.length; i++) {
            Assert.assertNull(farmer.eggs[i]);//check that the eggs array is empty
        }
    }

    @Test
    public void coloCarton() {
        farmer.fillinBox();
        farmer.cartonBoxes.forEach(maple -> {
            ;

            for (int i = 0; i < maple.ability.length; i++) {
                if (maple.ability[i] != null) {

                    assert maple.ability[0] != null;
                    Assert.assertEquals(maple.ability[0].color, maple.ability[i].color);//check that all the eggs in each carton box have the same color
                }
            }
        });

    }


}


