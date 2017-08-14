package ac.za.cput.factories;

import ac.za.cput.domain.FoodCoarse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;

/**
 *
 */
public class FoodCoarseFactoryTest {
    HashMap<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("coarseName","starter");
    }

    @Test
    public void getFoodCoarse() throws Exception {
        FoodCoarse foodCoarse = FoodCoarseFactory.getFoodCoarse(values);
        assertEquals("starter",foodCoarse.getCoarseName());
    }
}
