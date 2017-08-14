package ac.za.cput.services.Impl;

import ac.za.cput.domain.AdminContact;
import ac.za.cput.repositories.AdminContactRepository;
import ac.za.cput.repositories.Impl.AdminContactRepositoryImpl;
import ac.za.cput.services.AdminContactService;

/**
 *
 */
public class AdminContactServiceImpl implements AdminContactService{

    AdminContactRepository repository = AdminContactRepositoryImpl.getInstance();
    public AdminContact create(AdminContact adminContact) {
        return repository.create(adminContact);
    }

    public AdminContact read(String adminContactNumber1) {
        return repository.read(adminContactNumber1);
    }

    public AdminContact update(AdminContact adminContact) {
        return repository.update(adminContact);
    }

    public void delete(String adminContactNumber1) {
        repository.delete(adminContactNumber1);
    }
}
