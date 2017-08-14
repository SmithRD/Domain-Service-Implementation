package ac.za.cput.factories;

import ac.za.cput.domain.AdminContact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 *
 */
public class AdminContactFactoryTest {
    HashMap<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("adminContactNumber1","0721657799");
        values.put("adminContactNumber2","0219032890");
    }

    @Test
    public void getAdminContact() throws Exception {
        AdminContact adminContact = AdminContactFactory.getAdminContact(values);
        assertEquals("0721657799",adminContact.getAdminContactNumber1());
    }
}
