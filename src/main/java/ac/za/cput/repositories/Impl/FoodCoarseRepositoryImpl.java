package ac.za.cput.repositories.Impl;

import ac.za.cput.domain.FoodCoarse;
import ac.za.cput.repositories.FoodCoarseRepository;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class FoodCoarseRepositoryImpl implements FoodCoarseRepository{

    private static FoodCoarseRepositoryImpl respository = null;

    private Map<String,FoodCoarse> foodCoarseTable;

    private FoodCoarseRepositoryImpl() {
        foodCoarseTable = new HashMap<String, FoodCoarse>();
    }

    public static FoodCoarseRepositoryImpl getInstance(){
        if(respository==null)
            respository = new FoodCoarseRepositoryImpl();
        return respository;
    }

    public FoodCoarse create(FoodCoarse foodCoarse) {
        foodCoarseTable.put(foodCoarse.getCoarseName(),foodCoarse);
        FoodCoarse savedFoodCoarse =  foodCoarseTable.get(foodCoarse.getCoarseName());
        return savedFoodCoarse;
    }

    public FoodCoarse read(String coarseName) {
        FoodCoarse foodCoarse = foodCoarseTable.get(coarseName);
        return foodCoarse;
    }

    public FoodCoarse update(FoodCoarse foodCoarse) {
        foodCoarseTable.put(foodCoarse.getCoarseName(),foodCoarse);
        FoodCoarse updatedFoodCoarse =  foodCoarseTable.get(foodCoarse.getCoarseName());
        return updatedFoodCoarse;
    }

    public void delete(String coarseName) {
        foodCoarseTable.remove(coarseName);
    }
}
