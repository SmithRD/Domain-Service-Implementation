package ac.za.cput.domain;

import java.io.Serializable;

public class RestaurantContact implements Serializable {
    private String businessNumber1;
    private String businessNumber2;
    private String afterHoursNumber;
    private String websiteURL;

    public String getBusinessNumber1() {
        return businessNumber1;
    }

    public String getBusinessNumber2() {
        return businessNumber2;
    }

    public String getAfterHoursNumber() {
        return afterHoursNumber;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public RestaurantContact(){

    }

    public RestaurantContact(Builder builder) {
        this. businessNumber1 = builder. businessNumber1;
        this.businessNumber2 = builder.businessNumber2;
        this.afterHoursNumber = builder.afterHoursNumber;
        this.websiteURL = builder.websiteURL;
    }

    public static class Builder{
        private String businessNumber1;
        private String businessNumber2;
        private String afterHoursNumber;
        private String websiteURL;

        public Builder businessNumber1(String value){
            this.businessNumber1 = value;
            return this;
        }

        public Builder businessNumber2(String value){
            this.businessNumber2 = value;
            return this;
        }

        public Builder afterHoursNumber(String value){
            this.afterHoursNumber = value;
            return this;
        }

        public Builder websiteURL(String value){
            this.websiteURL = value;
            return this;
        }

        public  RestaurantContact build(){
            return new  RestaurantContact(this);
        }
    }
}
