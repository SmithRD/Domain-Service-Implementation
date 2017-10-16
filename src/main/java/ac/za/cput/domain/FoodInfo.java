package ac.za.cput.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class FoodInfo implements Serializable {

    @Id
    private String foodPictureID;
    private String coarseName;
    private String foodName;
    private Boolean foodStateActive;
    private Integer ratingValue;
    private String ratingComment;
    private Date ratingDate;
    @ManyToOne
    private User user;
    @ManyToOne
    private Restaurant restaurant;


    public String getFoodName() {
        return foodName;
    }

    public String getCoarseName() { return coarseName; }

    public String getFoodPictureID() {
        return foodPictureID;
    }

    public Boolean getFoodStateActive() {
        return foodStateActive;
    }

    public Integer getRatingValue() {
        return ratingValue;
    }

    public String getRatingComment() {
        return ratingComment;
    }

    public Date getRatingDate() {
        return ratingDate;
    }



    public FoodInfo(){

    }

    public FoodInfo(Builder builder) {
        this.foodName = builder.foodName;
        this.coarseName = builder.coarseName;
        this.foodPictureID = builder.foodPictureID;
        this.foodStateActive = builder.foodStateActive;
        this.ratingValue = builder.ratingValue;
        this.ratingComment = builder.ratingComment;
        this.ratingDate = builder.ratingDate;

    }

    public static class Builder{
        private String foodName;
        private String coarseName;
        private String foodPictureID;
        private Boolean foodStateActive;
        private Integer ratingValue;
        private String ratingComment;
        private Date ratingDate;



        public Builder foodName(String value){
            this.foodName = value;
            return this;
        }

        public Builder coarseName(String value) {
            this.coarseName = value;
            return this;
        }

        public Builder foodPictureID(String value){
            this.foodPictureID = value;
            return this;
        }

        public Builder foodStateActive(Boolean value){
            this.foodStateActive = value;
            return this;
        }

        public Builder ratingValue(Integer value){
            this.ratingValue = value;
            return this;
        }

        public Builder ratingComment(String value){
            this.ratingComment = value;
            return this;
        }

        public Builder ratingDate(Date value){
            this.ratingDate = value;
            return this;
        }

        public FoodInfo build(){
            return new FoodInfo(this);
        }
    }

}
