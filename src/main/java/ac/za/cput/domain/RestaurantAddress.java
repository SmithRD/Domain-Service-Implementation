package ac.za.cput.domain;

import java.io.Serializable;

public class RestaurantAddress implements Serializable {
    private String resAddress1;
    private String resAddress2;
    private Integer resPostalCode;

    public String getResAddress1() {
        return resAddress1;
    }

    public String getResAddress2() {
        return resAddress2;
    }

    public Integer getResPostalCode() {
        return resPostalCode;
    }

    public RestaurantAddress(){

    }

    public RestaurantAddress(Builder builder) {
        this.resAddress1 = builder.resAddress1;
        this.resAddress2 = builder.resAddress2;
        this.resPostalCode = builder.resPostalCode;
    }

    public static class Builder{
        private String resAddress1;
        private String resAddress2;
        private Integer resPostalCode;

        public Builder resAddress1(String value){
            this.resAddress1 = value;
            return this;
        }

        public Builder resAddress2(String value){
            this.resAddress2 = value;
            return this;
        }

        public Builder resPostalCode(Integer value){
            this.resPostalCode = value;
            return this;
        }

        public RestaurantAddress build(){
            return new RestaurantAddress(this);
        }
    }
}
