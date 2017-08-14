package ac.za.cput.factories;

import ac.za.cput.domain.AdminContact;

import java.util.HashMap;

/**
 *
 */
public class AdminContactFactory {
    public static AdminContact getAdminContact(HashMap<String, String> values){
        AdminContact adminContact = new AdminContact.Builder()
                .adminContactNumber1(values.get("adminContactNumber1"))
                .adminContactNumber2(values.get("adminContactNumber2"))
                .build();
        return adminContact;
    }
}
