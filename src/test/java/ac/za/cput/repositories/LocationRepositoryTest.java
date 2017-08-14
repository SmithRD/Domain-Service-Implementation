package ac.za.cput.repositories;

import ac.za.cput.domain.Location;
import ac.za.cput.factories.LocationFactory;
import ac.za.cput.repositories.Impl.LocationRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 *
 */
public class LocationRepositoryTest {
    HashMap<String,String> values;
    LocationRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = LocationRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("locationArea","Northern Suburbs");
        values.put("locationName","Kuilsriver");

    }

    @Test
    public void create() throws Exception {
        Location location = LocationFactory.getLocation(values);
        repository.create(location);
        assertEquals("Kuilsriver",location.getLocationName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Location readLocation = repository.read("Kuilsriver");
        assertEquals("Northern Suburbs",readLocation.getLocationArea());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Location location = repository.read("Kuilsriver");
        Location newLocation = new Location.Builder()
                .locationArea(values.get("locationArea"))
                .locationName("Bellville")
                .build();
        repository.update(newLocation);
        Location UpdateLocation = repository.read("Bellville");
        assertEquals("Northern Suburbs",UpdateLocation.getLocationArea());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("Bellville");
        Location location = repository.read("Bellville");
        assertNull(location);
    }

}
