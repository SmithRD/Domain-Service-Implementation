package ac.za.cput.domain;

import java.io.Serializable;

public class ResPaymentMethod implements Serializable {
    private Boolean cashPayable;
    private Boolean cardPayable;
    private String otherPaymentMethod;

    public Boolean getCashPayable() {
        return cashPayable;
    }

    public Boolean getCardPayable() {
        return cardPayable;
    }

    public String getOtherPaymentMethod() {
        return otherPaymentMethod;
    }

    public ResPaymentMethod(){

    }

    public  ResPaymentMethod(Builder builder) {
        this.cashPayable = builder.cashPayable;
        this.cardPayable = builder.cardPayable;
        this.otherPaymentMethod = builder.otherPaymentMethod;
    }

    public static class Builder {
        private Boolean cashPayable;
        private Boolean cardPayable;
        private String otherPaymentMethod;

        public Builder cashPayable(Boolean value) {
            this.cashPayable = value;
            return this;
        }

        public Builder cardPayable(Boolean value) {
            this.cardPayable = value;
            return this;
        }

        public Builder otherPaymentMethod(String value) {
            this.otherPaymentMethod = value;
            return this;
        }

        public ResPaymentMethod build() {
            return new ResPaymentMethod(this);
        }

    }
}
