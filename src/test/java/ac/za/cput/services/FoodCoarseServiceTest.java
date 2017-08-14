package ac.za.cput.services;

import ac.za.cput.domain.FoodCoarse;
import ac.za.cput.factories.FoodCoarseFactory;
import ac.za.cput.services.Impl.FoodCoarseServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 *
 */
public class FoodCoarseServiceTest {
    HashMap<String,String> values;
    FoodCoarseService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new FoodCoarseServiceImpl();
        values = new HashMap<String, String>();
        values.put("coarseName","drink");

    }

    @Test
    public void create() throws Exception {
        FoodCoarse foodCoarse = FoodCoarseFactory.getFoodCoarse(values);
        service.create(foodCoarse);
        assertEquals("drink",foodCoarse.getCoarseName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        FoodCoarse readFoodCoarse = service.read("drink");
        assertEquals("drink",readFoodCoarse.getCoarseName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        FoodCoarse foodCoarse = service.read("drink");
        FoodCoarse newFoodCoarse = new FoodCoarse.Builder()
                .coarseName("confectionery")
                .build();
        service.update(newFoodCoarse);
        FoodCoarse UpdateFoodCoarse = service.read("confectionery");
        assertEquals("confectionery",UpdateFoodCoarse.getCoarseName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        service.delete("confectionery");
        FoodCoarse foodCoarse = service.read("confectionery");
        assertNull(foodCoarse);
    }

}
