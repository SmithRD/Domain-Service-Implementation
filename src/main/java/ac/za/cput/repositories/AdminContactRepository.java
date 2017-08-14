package ac.za.cput.repositories;

import ac.za.cput.domain.AdminContact;

/**
 *
 */
public interface AdminContactRepository {
    AdminContact create(AdminContact adminContact);

    AdminContact read(String adminContactNumber1);

    AdminContact update(AdminContact adminContact);

    void delete(String adminContactNumber1);
}
