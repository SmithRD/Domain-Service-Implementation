package ac.za.cput.repositories.Impl;

import ac.za.cput.domain.Location;
import ac.za.cput.repositories.LocationRepository;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class LocationRepositoryImpl implements LocationRepository{

    private static LocationRepositoryImpl respository = null;

    private Map<String,Location> locationTable;

    private LocationRepositoryImpl() {locationTable = new HashMap<String, Location>();
    }

    public static LocationRepositoryImpl getInstance(){
        if(respository==null)
            respository = new LocationRepositoryImpl();
        return respository;
    }

    public Location create(Location location) {
        locationTable.put(location.getLocationName(),location);
        Location savedLocation =  locationTable.get(location.getLocationName());
        return savedLocation;
    }

    public Location read(String locationName) {
        Location location = locationTable.get(locationName);
        return location;
    }

    public Location update(Location location) {
        locationTable.put(location.getLocationName(),location);
        Location updatedLocation =  locationTable.get(location.getLocationName());
        return updatedLocation;
    }

    public void delete(String locationName) {
        locationTable.remove(locationName);
    }
}
