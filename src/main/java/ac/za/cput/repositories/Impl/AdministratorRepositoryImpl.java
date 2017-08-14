package ac.za.cput.repositories.Impl;

import ac.za.cput.domain.Administrator;
import ac.za.cput.repositories.AdministratorRepository;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class AdministratorRepositoryImpl implements AdministratorRepository{

    private static AdministratorRepositoryImpl respository = null;

    private Map<String,Administrator> administratorTable;

    private AdministratorRepositoryImpl() {
        administratorTable = new HashMap<String, Administrator>();
    }

    public static AdministratorRepositoryImpl getInstance(){
        if(respository==null)
            respository = new AdministratorRepositoryImpl();
        return respository;
    }

    public Administrator create(Administrator administrator) {
        administratorTable.put(administrator.getAdminID(),administrator);
        Administrator savedAdministrator =  administratorTable.get(administrator.getAdminID());
        return savedAdministrator;
    }

    public Administrator read(String adminID) {
        Administrator administrator = administratorTable.get(adminID);
        return administrator;
    }

    public Administrator update(Administrator administrator) {
        administratorTable.put(administrator.getAdminID(),administrator);
        Administrator updatedAdministrator =  administratorTable.get(administrator.getAdminID());
        return updatedAdministrator;
    }

    public void delete(String adminID) {
        administratorTable.remove(adminID);
    }
}
