package ac.za.cput.services;

import ac.za.cput.domain.Location;

/**
 * .
 */
public interface LocationService {
    Location create(Location location);

    Location read(String locationName);

    Location update(Location location);

    void delete(String locationName);
}
