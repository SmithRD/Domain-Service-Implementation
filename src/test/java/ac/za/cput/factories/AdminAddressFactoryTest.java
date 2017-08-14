package ac.za.cput.factories;

import ac.za.cput.domain.AdminAddress;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

/**
 *
 */
public class AdminAddressFactoryTest {
    HashMap<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("adminAddress1","35 Johnson Street");
        values.put("adminAddress2","Amandelsig");
    }

    @Test
    public void getAdminAddress() throws Exception {
        AdminAddress adminAddress = AdminAddressFactory.getAdminAddress(values,7580);
        assertEquals("35 Johnson Street",adminAddress.getAdminAddress1());
    }
}
