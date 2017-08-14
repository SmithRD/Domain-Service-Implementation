package ac.za.cput.services;

import ac.za.cput.domain.FoodCoarse;

/**
 * .
 */
public interface FoodCoarseService {
    FoodCoarse create(FoodCoarse foodCoarse);

    FoodCoarse read(String coarseName);

    FoodCoarse update(FoodCoarse foodCoarse);

    void delete(String coarseName);
}
