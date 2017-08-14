package ac.za.cput.factories;

import ac.za.cput.domain.FoodCoarse;

import java.util.HashMap;

/**
 *
 */
public class FoodCoarseFactory {
    public static FoodCoarse getFoodCoarse(HashMap<String,String> values){
        FoodCoarse foodCoarse = new FoodCoarse.Builder()
                .coarseName(values.get("coarseName"))
                .build();
        return foodCoarse;
    }

}
