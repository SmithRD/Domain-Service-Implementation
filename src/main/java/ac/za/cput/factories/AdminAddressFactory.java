package ac.za.cput.factories;

import ac.za.cput.domain.AdminAddress;

import java.util.HashMap;

/**
 *
 */
public class AdminAddressFactory {
    public static AdminAddress getAdminAddress(HashMap<String, String> values, Integer adminPostalCode){
        AdminAddress adminAddress = new AdminAddress.Builder()
                .adminAddress1(values.get("adminAddress1"))
                .adminAddress2(values.get("adminAddress2"))
                .adminPostalCode(adminPostalCode)
                .build();
        return adminAddress;
    }
}
