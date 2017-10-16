package ac.za.cput.repositories;

import ac.za.cput.domain.ProfileModificationLog;
import org.springframework.data.repository.CrudRepository;

public interface ProfileModificationLogRepository extends CrudRepository<ProfileModificationLog, String> {
}
