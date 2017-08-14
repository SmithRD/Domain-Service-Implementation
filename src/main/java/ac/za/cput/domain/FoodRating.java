package ac.za.cput.domain;

import java.io.Serializable;
import java.util.Date;

public class FoodRating implements Serializable {
    private Integer ratingValue;
    private String ratingComment;
    private Date ratingDate;
    private User user;

    public Integer getRatingValue() {
        return ratingValue;
    }

    public String getRatingComment() {
        return ratingComment;
    }

    public Date getRatingDate() {
        return ratingDate;
    }

    public User getUser() {
        return user;
    }

    public FoodRating(){

    }

    public FoodRating(Builder builder) {
        this.ratingValue = builder.ratingValue;
        this.ratingComment = builder.ratingComment;
        this.ratingDate = builder.ratingDate;
        this.user = builder.user;
    }

    public static class Builder{
        private Integer ratingValue;
        private String ratingComment;
        private Date ratingDate;
        private User user;

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

        public Builder user(User value){
            this.user = value;
            return this;
        }

        public FoodRating build(){
            return new FoodRating(this);
        }
    }


}
