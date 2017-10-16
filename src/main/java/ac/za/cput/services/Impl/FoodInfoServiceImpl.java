package ac.za.cput.services.Impl;

import ac.za.cput.domain.FoodInfo;
import ac.za.cput.repositories.FoodInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class FoodInfoServiceImpl {
    @Autowired
    private FoodInfoRepository foodInfoRepository;

    public List<FoodInfo> getAll(){
        List<FoodInfo> foodInfos = new ArrayList<>();
        foodInfoRepository.findAll()
                .forEach(foodInfos::add);
        return foodInfos;
    }

    public FoodInfo create(FoodInfo entity){
        return foodInfoRepository.save(entity);
    }

    public FoodInfo read(String foodPictureID){
        return foodInfoRepository.findOne(foodPictureID);
    }

    public FoodInfo update(String foodPictureID, FoodInfo foodInfo){
        return foodInfoRepository.save(foodInfo);
    }

    public void delete(String foodPictureID){
        foodInfoRepository.delete(foodPictureID);
    }



}
