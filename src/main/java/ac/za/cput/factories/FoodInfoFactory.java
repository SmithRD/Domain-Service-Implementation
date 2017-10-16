package ac.za.cput.factories;

import ac.za.cput.domain.FoodInfo;
import ac.za.cput.domain.Restaurant;
import ac.za.cput.utility.KeyGenerator;

import java.util.Date;
import java.util.HashMap;

/**
 *
 */
public class FoodInfoFactory {
    public static FoodInfo buildFoodInfo(String coarseName, String foodName,Boolean foodStateActive,Integer ratingValue,String ratingComment,Date ratingDate){
        FoodInfo foodInfo = new FoodInfo.Builder()
                .foodPictureID(KeyGenerator.getEntityId())
                .coarseName(coarseName)
                .foodName(foodName)
                .foodStateActive(foodStateActive)
                .ratingValue(ratingValue)
                .ratingComment(ratingComment)
                .ratingDate(ratingDate)
                .build();
        return foodInfo;
    }
}
