package ac.za.cput.domain;

import java.io.Serializable;

public class ResDelivery implements Serializable {
    private Boolean deliveryAvailable;

    public Boolean getDeliveryAvailable() {
        return deliveryAvailable;
    }

    public ResDelivery() {

    }

    public ResDelivery(Builder builder) {
        this.deliveryAvailable = builder.deliveryAvailable;
    }

    public static class Builder {
        private Boolean deliveryAvailable;

        public Builder deliveryAvailable(Boolean value) {
            this.deliveryAvailable = value;
            return this;
        }


        public ResDelivery build() {
            return new ResDelivery(this);
        }
    }
}

