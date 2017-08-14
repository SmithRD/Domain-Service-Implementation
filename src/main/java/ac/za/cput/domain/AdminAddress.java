package ac.za.cput.domain;

import java.io.Serializable;

public class AdminAddress implements Serializable {
    private String adminAddress1;
    private String adminAddress2;
    private Integer adminPostalCode;

    public String getAdminAddress1() {
        return adminAddress1;
    }

    public String getAdminAddress2() {
        return adminAddress2;
    }

    public Integer getAdminPostalCode() {
        return adminPostalCode;
    }

    public AdminAddress() {

    }

    public AdminAddress(Builder builder) {
        this.adminAddress1 = builder.adminAddress1;
        this.adminAddress2 = builder.adminAddress2;
        this.adminPostalCode = builder.adminPostalCode;
    }

    public static class Builder {
        private String adminAddress1;
        private String adminAddress2;
        private Integer adminPostalCode;

        public Builder adminAddress1(String value) {
            this.adminAddress1 = value;
            return this;
        }

        public Builder adminAddress2(String value) {
            this.adminAddress2 = value;
            return this;
        }

        public Builder adminPostalCode(Integer value) {
            this.adminPostalCode = value;
            return this;
        }

        public AdminAddress build() {
            return new AdminAddress(this);
        }
    }
}
