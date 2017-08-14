package ac.za.cput.services;

import ac.za.cput.domain.AdminAddress;

/**
 *
 */
public interface AdminAddressService {
    AdminAddress create(AdminAddress adminAddress);

    AdminAddress read(String adminAddress1);

    AdminAddress update(AdminAddress adminAddress);

    void delete(String adminAddress1);
}
