package ac.za.cput.domain;

import java.io.Serializable;

public class AdminContact implements Serializable {
    private String adminContactNumber1;
    private String adminContactNumber2;

    public String getAdminContactNumber1() {
        return adminContactNumber1;
    }

    public String getAdminContactNumber2() {
        return adminContactNumber2;
    }

    public AdminContact() {

    }

    public AdminContact(Builder builder) {
        this.adminContactNumber1 = builder.adminContactNumber1;
        this.adminContactNumber2 = builder.adminContactNumber2;
    }

    public static class Builder {
        private String adminContactNumber1;
        private String adminContactNumber2;

        public Builder adminContactNumber1(String value) {
            this.adminContactNumber1 = value;
            return this;
        }

        public Builder adminContactNumber2(String value) {
            this.adminContactNumber2 = value;
            return this;
        }

        public AdminContact build() {
            return new AdminContact(this);
        }
    }
}
