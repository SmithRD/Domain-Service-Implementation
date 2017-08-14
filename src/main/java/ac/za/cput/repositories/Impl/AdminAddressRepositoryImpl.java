package ac.za.cput.repositories.Impl;

import ac.za.cput.domain.AdminAddress;
import ac.za.cput.repositories.AdminAddressRepository;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class AdminAddressRepositoryImpl implements AdminAddressRepository {

    private static AdminAddressRepositoryImpl respository = null;

    private Map<String,AdminAddress> adminAddressTable;

    private AdminAddressRepositoryImpl() {
        adminAddressTable = new HashMap<String, AdminAddress>();
    }

    public static AdminAddressRepositoryImpl getInstance(){
        if(respository==null)
            respository = new AdminAddressRepositoryImpl();
        return respository;
    }

    public AdminAddress create(AdminAddress adminAddress) {
        adminAddressTable.put(adminAddress.getAdminAddress1(),adminAddress);
        AdminAddress savedAdminAddress =  adminAddressTable.get(adminAddress.getAdminAddress1());
        return savedAdminAddress;
    }

    public AdminAddress read(String adminAddress1) {
        AdminAddress adminAddress = adminAddressTable.get(adminAddress1);
        return adminAddress;
    }

    public AdminAddress update(AdminAddress adminAddress) {
        adminAddressTable.put(adminAddress.getAdminAddress1(),adminAddress);
        AdminAddress updatedAdminAddress =  adminAddressTable.get(adminAddress.getAdminAddress1());
        return updatedAdminAddress;
    }

    public void delete(String adminAddress1) {
        adminAddressTable.remove(adminAddress1);
    }
}
