package ac.za.cput.services;

import ac.za.cput.domain.AdminAddress;
import ac.za.cput.factories.AdminAddressFactory;
import ac.za.cput.services.Impl.AdminAddressServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 * C
 */
public class AdminAddressServiceTest {
    HashMap<String,String> values;
    AdminAddressService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new AdminAddressServiceImpl();
        values = new HashMap<String, String>();
        values.put("adminAddress1","24 Jones Street");
        values.put("adminAddress2","Moneyhill");

    }

    @Test
    public void create() throws Exception {
        AdminAddress adminAddress = AdminAddressFactory.getAdminAddress(values,7580);
        service.create(adminAddress);
        assertEquals("24 Jones Street", adminAddress.getAdminAddress1());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        AdminAddress readAdminAddress = service.read("24 Jones Street");
        assertEquals("Moneyhill",readAdminAddress.getAdminAddress2());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        AdminAddress adminAddress = service.read("24 Jones Street");
        AdminAddress newAdminAddress = new AdminAddress.Builder()
                .adminAddress1(values.get("adminAddress1"))
                .adminAddress2("Honeyhill")
                .adminPostalCode(7580)
                .build();
        service.update(newAdminAddress);
        AdminAddress UpdateAdminAddress = service.read("24 Jones Street");
        assertEquals("Honeyhill",UpdateAdminAddress.getAdminAddress2());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        service.delete("24 Jones Street");
        AdminAddress adminAddress = service.read("24 Jones Street");
        assertNull(adminAddress);
    }
}
