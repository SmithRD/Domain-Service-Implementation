package ac.za.cput.repositories;

import ac.za.cput.domain.AdminAddress;

/**
 *
 */
public interface AdminAddressRepository {
    AdminAddress create(AdminAddress adminAddress);

    AdminAddress read(String adminAddress1);

    AdminAddress update(AdminAddress adminAddress);

    void delete(String adminAddress1);
}
