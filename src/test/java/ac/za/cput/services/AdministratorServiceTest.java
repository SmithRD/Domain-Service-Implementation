package ac.za.cput.services;

import ac.za.cput.domain.AdminAddress;
import ac.za.cput.domain.Administrator;
import ac.za.cput.factories.AdministratorFactory;
import ac.za.cput.services.Impl.AdministratorServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 *
 */
public class AdministratorServiceTest {
    HashMap<String,String> values;
    AdministratorService service;
    AdminAddress adminAddress;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new AdministratorServiceImpl();
        values = new HashMap<String, String>();
        values.put("adminEmail","jjones2@gmail.com");
        values.put("adminID","22wer3");
        values.put("adminFirstName","James");
        values.put("adminLastName","Jones");
        values.put("adminPassword","theboss");

    }

    @Test
    public void create() throws Exception {
        Administrator administrator = AdministratorFactory.getAdministrator(values,adminAddress);
        service.create(administrator);
        assertEquals("22wer3",administrator.getAdminID());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Administrator readAdministrator = service.read("22wer3");
        assertEquals("James",readAdministrator.getAdminFirstName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Administrator administrator = service.read("22wer3");
        Administrator newAdministrator = new Administrator.Builder()
                .adminEmail(values.get("adminEmail"))
                .adminID(values.get("adminID"))
                .adminFirstName("Allen")
                .adminLastName("Pieters")
                .adminPassword(values.get("adminPassword"))
                .build();
        service.update(newAdministrator);
        Administrator UpdateAdministrator = service.read("22wer3");
        assertEquals("Allen",UpdateAdministrator.getAdminFirstName());
        assertEquals("Pieters",UpdateAdministrator.getAdminLastName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        service.delete("22wer3");
        Administrator administrator = service.read("22wer3");
        assertNull(administrator);
    }
}
