package ac.za.cput.services.Impl;

import ac.za.cput.domain.AdminAddress;
import ac.za.cput.repositories.AdminAddressRepository;
import ac.za.cput.repositories.Impl.AdminAddressRepositoryImpl;
import ac.za.cput.services.AdminAddressService;

/**
 *
 */
public class AdminAddressServiceImpl implements AdminAddressService{

    AdminAddressRepository repository = AdminAddressRepositoryImpl.getInstance();
    public AdminAddress create(AdminAddress adminAddress) {
        return repository.create(adminAddress);
    }

    public AdminAddress read(String adminAddress1) {
        return repository.read(adminAddress1);
    }

    public AdminAddress update(AdminAddress adminAddress) {
        return repository.update(adminAddress);
    }

    public void delete(String adminAddress1) {
        repository.delete(adminAddress1);
    }
}
