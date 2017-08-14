package ac.za.cput.repositories;

import ac.za.cput.domain.AdminAddress;
import ac.za.cput.domain.Administrator;
import ac.za.cput.factories.AdministratorFactory;
import ac.za.cput.repositories.Impl.AdministratorRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 *
 */
public class AdministratorRepositoryTest {
    HashMap<String,String> values;
    AdministratorRepository repository;
    AdminAddress adminAddress;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = AdministratorRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("adminEmail","jjones@gmail.com");
        values.put("adminID","22wer4");
        values.put("adminFirstName","John");
        values.put("adminLastName","Jones");
        values.put("adminPassword","theboss");

    }

    @Test
    public void create() throws Exception {
        Administrator administrator = AdministratorFactory.getAdministrator(values,adminAddress);
        repository.create(administrator);
        assertEquals("22wer4",administrator.getAdminID());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Administrator readAdministrator = repository.read("22wer4");
        assertEquals("John",readAdministrator.getAdminFirstName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Administrator administrator = repository.read("22wer4");
        Administrator newAdministrator = new Administrator.Builder()
                .adminEmail(values.get("adminEmail"))
                .adminID(values.get("adminID"))
                .adminFirstName("Peter")
                .adminLastName("Pumpkin")
                .adminPassword(values.get("adminPassword"))
                .build();
        repository.update(newAdministrator);
        Administrator UpdateAdministrator = repository.read("22wer4");
        assertEquals("Peter",UpdateAdministrator.getAdminFirstName());
        assertEquals("Pumpkin",UpdateAdministrator.getAdminLastName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("22wer4");
        Administrator administrator = repository.read("22wer4");
        assertNull(administrator);
    }

}
