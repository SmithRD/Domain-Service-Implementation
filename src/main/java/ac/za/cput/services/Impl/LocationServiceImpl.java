package ac.za.cput.services.Impl;

import ac.za.cput.domain.Location;
import ac.za.cput.repositories.Impl.LocationRepositoryImpl;
import ac.za.cput.repositories.LocationRepository;
import ac.za.cput.services.LocationService;

/**
 *
 */
public class LocationServiceImpl implements LocationService{

    LocationRepository repository = LocationRepositoryImpl.getInstance();
    public Location create(Location location) {
        return repository.create(location);
    }

    public Location read(String locationName) {
        return repository.read(locationName);
    }

    public Location update(Location location) {
        return repository.update(location);
    }

    public void delete(String locationName) {
        repository.delete(locationName);
    }
}
