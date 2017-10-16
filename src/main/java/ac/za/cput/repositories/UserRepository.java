package ac.za.cput.repositories;

import ac.za.cput.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface UserRepository extends CrudRepository<User, String> {
}
