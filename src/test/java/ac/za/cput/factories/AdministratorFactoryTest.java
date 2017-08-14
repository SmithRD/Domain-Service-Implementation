package ac.za.cput.factories;

import ac.za.cput.domain.AdminAddress;
import ac.za.cput.domain.Administrator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;

/**
 *
 */
public class AdministratorFactoryTest {
    HashMap<String,String> values;
    AdminAddress adminAddress;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("adminEmail","jjones@gmail.com");
        values.put("adminID","22wer4");
        values.put("adminFirstName","John");
        values.put("adminLastName","Jones");
        values.put("adminPassword","theboss");
    }

    @Test
    public void getAdministrator() throws Exception {
        Administrator administrator = AdministratorFactory.getAdministrator(values, adminAddress);
        assertEquals("22wer4",administrator.getAdminID());
    }
}
