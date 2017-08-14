package ac.za.cput.factories;

import ac.za.cput.domain.Location;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 *
 */
public class LocationFactoryTest {
    HashMap<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("locationArea","Northern Suburbs");
        values.put("locationName","Kuilsriver");
    }

    @Test
    public void getLocation() throws Exception {
        Location location = LocationFactory.getLocation(values);
        assertEquals("Kuilsriver",location.getLocationName());
    }
}
