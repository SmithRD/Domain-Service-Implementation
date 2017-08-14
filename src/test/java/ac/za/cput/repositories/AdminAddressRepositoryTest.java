package ac.za.cput.repositories;

import ac.za.cput.domain.AdminAddress;
import ac.za.cput.factories.AdminAddressFactory;
import ac.za.cput.repositories.Impl.AdminAddressRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 *
 */
public class AdminAddressRepositoryTest {
    HashMap<String,String> values;
    AdminAddressRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = AdminAddressRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("adminAddress1","25 Jones Street");
        values.put("adminAddress2","Richmanhill");

    }

    @Test
    public void create() throws Exception {
        AdminAddress adminAddress = AdminAddressFactory.getAdminAddress(values,7580);
        repository.create(adminAddress);
        assertEquals("25 Jones Street", adminAddress.getAdminAddress1());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        AdminAddress readAdminAddress = repository.read("25 Jones Street");
        assertEquals("Richmanhill",readAdminAddress.getAdminAddress2());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        AdminAddress adminAddress = repository.read("25 Jones Street");
        AdminAddress newAdminAddress = new AdminAddress.Builder()
                .adminAddress1(values.get("adminAddress1"))
                .adminAddress2("Poormanhill")
                .adminPostalCode(7580)
                .build();
        repository.update(newAdminAddress);
        AdminAddress UpdateAdminAddress = repository.read("25 Jones Street");
        assertEquals("Poormanhill",UpdateAdminAddress.getAdminAddress2());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("25 Jones Street");
        AdminAddress adminAddress = repository.read("25 Jones Street");
        assertNull(adminAddress);
    }
}
