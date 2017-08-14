package ac.za.cput.repositories;

import ac.za.cput.domain.Location;

/**
 *
 */
public interface LocationRepository {
    Location create(Location location);

    Location read(String locationName);

    Location update(Location location);

    void delete(String locationName);
}
