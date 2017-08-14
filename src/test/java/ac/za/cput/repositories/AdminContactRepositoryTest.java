package ac.za.cput.repositories;

import ac.za.cput.domain.AdminContact;
import ac.za.cput.factories.AdminContactFactory;
import ac.za.cput.repositories.Impl.AdminContactRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 *
 */
public class AdminContactRepositoryTest {
    HashMap<String,String> values;
    AdminContactRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = AdminContactRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("adminContactNumber1","0631234567");
        values.put("adminContactNumber2","0214567890");

    }

    @Test
    public void create() throws Exception {
        AdminContact adminContact = AdminContactFactory.getAdminContact(values);
        repository.create(adminContact);
        assertEquals("0214567890",adminContact.getAdminContactNumber2());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        AdminContact readAdminContact = repository.read("0631234567");
        assertEquals("0214567890",readAdminContact.getAdminContactNumber2());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        AdminContact adminContact = repository.read("0631234567");
        AdminContact newAdminContact = new AdminContact.Builder()
                .adminContactNumber1(values.get("adminContactNumber1"))
                .adminContactNumber2("0219999999")
                .build();
        repository.update(newAdminContact);
        AdminContact UpdateAdminContact = repository.read("0631234567");
        assertEquals("0219999999",UpdateAdminContact.getAdminContactNumber2());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("0631234567");
        AdminContact adminContact = repository.read("0631234567");
        assertNull(adminContact);
    }

}
