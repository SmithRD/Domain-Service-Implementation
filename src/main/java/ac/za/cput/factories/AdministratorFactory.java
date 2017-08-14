package ac.za.cput.factories;

import ac.za.cput.domain.AdminAddress;
import ac.za.cput.domain.Administrator;

import java.util.HashMap;

/**
 *
 */
public class AdministratorFactory {
    public static Administrator getAdministrator(HashMap<String, String> values, AdminAddress adminAddress){
        Administrator administrator = new Administrator.Builder()
                .adminEmail(values.get("adminEmail"))
                .adminID(values.get("adminID"))
                .adminFirstName(values.get("adminFirstName"))
                .adminLastName(values.get("adminLastName"))
                .adminPassword(values.get("adminPassword"))
                .adminAddress(adminAddress)
                .build();
        return administrator;
    }
}
