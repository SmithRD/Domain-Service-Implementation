package ac.za.cput.repositories.Impl;

import ac.za.cput.domain.AdminContact;
import ac.za.cput.repositories.AdminContactRepository;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class AdminContactRepositoryImpl implements AdminContactRepository{

    private static AdminContactRepositoryImpl respository = null;

    private Map<String,AdminContact> adminContactTable;

    private AdminContactRepositoryImpl() {
        adminContactTable = new HashMap<String, AdminContact>();
    }

    public static AdminContactRepositoryImpl getInstance(){
        if(respository==null)
            respository = new AdminContactRepositoryImpl();
        return respository;
    }

    public AdminContact create(AdminContact adminContact) {
        adminContactTable.put(adminContact.getAdminContactNumber1(),adminContact);
        AdminContact savedAdminContact =  adminContactTable.get(adminContact.getAdminContactNumber1());
        return savedAdminContact;
    }

    public AdminContact read(String adminContactNumber1) {
        AdminContact adminContact = adminContactTable.get(adminContactNumber1);
        return adminContact;
    }

    public AdminContact update(AdminContact adminContact) {
        adminContactTable.put(adminContact.getAdminContactNumber1(),adminContact);
        AdminContact updatedAdminContact =  adminContactTable.get(adminContact.getAdminContactNumber1());
        return updatedAdminContact;
    }

    public void delete(String adminContactNumber1) {
        adminContactTable.remove(adminContactNumber1);
    }
}
