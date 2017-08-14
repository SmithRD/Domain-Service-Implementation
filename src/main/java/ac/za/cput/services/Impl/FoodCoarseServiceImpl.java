package ac.za.cput.services.Impl;

import ac.za.cput.domain.FoodCoarse;
import ac.za.cput.repositories.FoodCoarseRepository;
import ac.za.cput.repositories.Impl.FoodCoarseRepositoryImpl;
import ac.za.cput.services.FoodCoarseService;

/**
 *
 */
public class FoodCoarseServiceImpl implements FoodCoarseService{

    FoodCoarseRepository repository = FoodCoarseRepositoryImpl.getInstance();
    public FoodCoarse create(FoodCoarse foodCoarse) {
        return repository.create(foodCoarse);
    }

    public FoodCoarse read(String coarseName) {
        return repository.read(coarseName);
    }

    public FoodCoarse update(FoodCoarse foodCoarse) {
        return repository.update(foodCoarse);
    }

    public void delete(String coarseName) {
        repository.delete(coarseName);
    }
}
