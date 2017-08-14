package ac.za.cput.repositories;

import ac.za.cput.domain.FoodCoarse;
import ac.za.cput.factories.FoodCoarseFactory;
import ac.za.cput.repositories.Impl.FoodCoarseRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 *
 */
public class FoodCoarseRepositoryTest {
    HashMap<String,String> values;
    FoodCoarseRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = FoodCoarseRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("coarseName","dessert");

    }

    @Test
    public void create() throws Exception {
        FoodCoarse foodCoarse = FoodCoarseFactory.getFoodCoarse(values);
        repository.create(foodCoarse);
        assertEquals("dessert",foodCoarse.getCoarseName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        FoodCoarse readFoodCoarse = repository.read("dessert");
        assertEquals("dessert",readFoodCoarse.getCoarseName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        FoodCoarse foodCoarse = repository.read("dessert");
        FoodCoarse newFoodCoarse = new FoodCoarse.Builder()
                .coarseName("main")
                .build();
        repository.update(newFoodCoarse);
        FoodCoarse UpdateFoodCoarse = repository.read("main");
        assertEquals("main",UpdateFoodCoarse.getCoarseName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("main");
        FoodCoarse foodCoarse = repository.read("main");
        assertNull(foodCoarse);
    }

}
