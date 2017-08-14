package ac.za.cput.repositories;

import ac.za.cput.domain.FoodCoarse;

/**
 *
 */
public interface FoodCoarseRepository {
    FoodCoarse create(FoodCoarse foodCoarse);

    FoodCoarse read(String coarseName);

    FoodCoarse update(FoodCoarse foodCoarse);

    void delete(String coarseName);
}
