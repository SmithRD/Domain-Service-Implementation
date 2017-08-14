package ac.za.cput.services;

import ac.za.cput.domain.Location;
import ac.za.cput.factories.LocationFactory;
import ac.za.cput.services.Impl.LocationServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 *
 */
public class LocationServiceTest {
    HashMap<String,String> values;
    LocationService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new LocationServiceImpl();
        values = new HashMap<String, String>();
        values.put("locationArea","Northern Suburbs");
        values.put("locationName","Durbanville");

    }

    @Test
    public void create() throws Exception {
        Location location = LocationFactory.getLocation(values);
        service.create(location);
        assertEquals("Durbanville",location.getLocationName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Location readLocation = service.read("Durbanville");
        assertEquals("Northern Suburbs",readLocation.getLocationArea());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Location location = service.read("Durbanville");
        Location newLocation = new Location.Builder()
                .locationArea(values.get("locationArea"))
                .locationName("Bellville")
                .build();
        service.update(newLocation);
        Location UpdateLocation = service.read("Bellville");
        assertEquals("Northern Suburbs",UpdateLocation.getLocationArea());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        service.delete("Bellville");
        Location location = service.read("Bellville");
        assertNull(location);
    }

}
