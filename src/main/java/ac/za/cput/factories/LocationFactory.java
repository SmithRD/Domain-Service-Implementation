package ac.za.cput.factories;

import ac.za.cput.domain.Location;

import java.util.HashMap;

/**
 *
 */
public class LocationFactory {
    public static Location getLocation(HashMap<String,String> values){
        Location location = new Location.Builder()
                .locationArea(values.get("locationArea"))
                .locationName(values.get("locationName"))
                .build();
        return location;
    }
}
