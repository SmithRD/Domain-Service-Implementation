package ac.za.cput.services;

import ac.za.cput.domain.AdminContact;

/**
 *
 */
public interface AdminContactService {
    AdminContact create(AdminContact adminContact);

    AdminContact read(String adminContactNumber1);

    AdminContact update(AdminContact adminContact);

    void delete(String adminContactNumber1);
}
