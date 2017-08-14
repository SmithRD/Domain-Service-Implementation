package ac.za.cput.services.Impl;

import ac.za.cput.domain.Administrator;
import ac.za.cput.repositories.AdministratorRepository;
import ac.za.cput.repositories.Impl.AdministratorRepositoryImpl;
import ac.za.cput.services.AdministratorService;

/**
 *
 */
public class AdministratorServiceImpl implements AdministratorService {

    AdministratorRepository repository = AdministratorRepositoryImpl.getInstance();
    public Administrator create(Administrator administrator) {
        return repository.create(administrator);
    }

    public Administrator read(String adminID) {
        return repository.read(adminID);
    }

    public Administrator update(Administrator administrator) {
        return repository.update(administrator);
    }

    public void delete(String adminID) {
        repository.delete(adminID);
    }
}
