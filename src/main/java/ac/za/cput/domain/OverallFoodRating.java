package ac.za.cput.domain;

import java.io.Serializable;

public class OverallFoodRating implements Serializable {
    private Integer overallRatingValue;
    private Long overallRatingCounter;
    private FoodInfo foodInfo;

    public Integer getOverallRatingValue() {
        return overallRatingValue;
    }

    public Long getOverallRatingCounter() {
        return overallRatingCounter;
    }

    public FoodInfo getFoodInfo() {
        return foodInfo;
    }

    public OverallFoodRating(){

    }

    public OverallFoodRating(Builder builder) {
        this.overallRatingValue = builder.overallRatingValue;
        this.overallRatingCounter = builder.overallRatingCounter;
        this.foodInfo = builder.foodInfo;
    }

    public static class Builder{
        private Integer overallRatingValue;
        private Long overallRatingCounter;
        private FoodInfo foodInfo;

        public Builder overallRatingValue(Integer value){
            this.overallRatingValue = value;
            return this;
        }

        public Builder overallRatingCounter(Long value){
            this.overallRatingCounter = value;
            return this;
        }

        public Builder foodInfo(FoodInfo value){
            this.foodInfo = value;
            return this;
        }

        public  OverallFoodRating build(){
            return new  OverallFoodRating(this);
        }
    }
}
