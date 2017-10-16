package ac.za.cput.factories;

import ac.za.cput.domain.Restaurant;
import ac.za.cput.utility.KeyGenerator;

import java.util.Date;
import java.util.HashMap;

/**
 *
 */
public class RestaurantFactory {
    public static Restaurant buildRestaurant(String restaurantName, Boolean restaurantVerifide, Boolean restaurantActive, String businessNumber1, String businessNumber2, String websiteURL, String locationArea, String resAddress1, String resAddress2, Integer resPostalCode){
        Restaurant restaurant = new Restaurant.Builder()
                .restaurantID(KeyGenerator.getEntityId())
                .restaurantName(restaurantName)
                .restaurantVerifide(restaurantVerifide)
                .restaurantActive(restaurantActive)
                .businessNumber1(businessNumber1)
                .businessNumber2(businessNumber2)
                .websiteURL(websiteURL)
                .locationArea(locationArea)
                .resAddress1(resAddress1)
                .resAddress2(resAddress2)
                .resPostalCode(resPostalCode)
                .build();
        return restaurant;

    }
}
