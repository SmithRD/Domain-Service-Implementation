package ac.za.cput.services;

import ac.za.cput.domain.AdminContact;
import ac.za.cput.factories.AdminContactFactory;
import ac.za.cput.services.Impl.AdminContactServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 *
 */
public class AdminContactServiceTest {
    HashMap<String,String> values;
    AdminContactService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new AdminContactServiceImpl();
        values = new HashMap<String, String>();
        values.put("adminContactNumber1","0621223344");
        values.put("adminContactNumber2","0211112222");

    }

    @Test
    public void create() throws Exception {
        AdminContact adminContact = AdminContactFactory.getAdminContact(values);
        service.create(adminContact);
        assertEquals("0211112222", adminContact.getAdminContactNumber2());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        AdminContact readAdminContact = service.read("0621223344");
        assertEquals("0211112222",readAdminContact.getAdminContactNumber2());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        AdminContact adminContact = service.read("0621223344");
        AdminContact newAdminContact = new AdminContact.Builder()
                .adminContactNumber1(values.get("adminContactNumber1"))
                .adminContactNumber2("0213333333")
                .build();
        service.update(newAdminContact);
        AdminContact UpdateAdminContact = service.read("0621223344");
        assertEquals("0213333333",UpdateAdminContact.getAdminContactNumber2());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        service.delete("0621223344");
        AdminContact adminContact = service.read("0621223344");
        assertNull(adminContact);
    }
}
