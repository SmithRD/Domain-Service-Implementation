package ac.za.cput.repositories;

import ac.za.cput.domain.Administrator;

/**
 *
 */
public interface AdministratorRepository {
    Administrator create(Administrator administrator);

    Administrator read(String adminID);

    Administrator update(Administrator administrator);

    void delete(String adminID);
}
