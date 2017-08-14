package ac.za.cput.services;

import ac.za.cput.domain.Administrator;

/**
 *
 */
public interface AdministratorService {
    Administrator create(Administrator administrator);

    Administrator read(String adminID);

    Administrator update(Administrator administrator);

    void delete(String adminID);
}
