package ac.za.cput.repositories;

import ac.za.cput.domain.Restaurant;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface RestaurantRepository extends CrudRepository<Restaurant, String> {
}
