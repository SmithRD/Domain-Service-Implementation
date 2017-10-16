package ac.za.cput.factories;

import ac.za.cput.domain.Administrator;
import ac.za.cput.utility.KeyGenerator;

/**
 *
 */
public class AdministratorFactory {
    public static Administrator buildAdministrator(String adminEmail, String adminFirstName, String adminLastName, String adminPassword, String adminAddress1, String adminAddress2, Integer adminPostalCode, String adminContactNumber1, String adminContactNumber2){
        Administrator administrator = new Administrator.Builder()
                .adminID(KeyGenerator.getEntityId())
                .adminEmail(adminEmail)
                .adminFirstName(adminFirstName)
                .adminLastName(adminLastName)
                .adminPassword(adminPassword)
                .adminAddress1(adminAddress1)
                .adminAddress2(adminAddress2)
                .adminPostalCode(adminPostalCode)
                .adminContactNumber1(adminContactNumber1)
                .adminContactNumber2(adminContactNumber2)
                .build();
        return administrator;
    }
}
