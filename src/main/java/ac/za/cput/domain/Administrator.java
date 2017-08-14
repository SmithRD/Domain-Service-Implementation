package ac.za.cput.domain;

import java.io.Serializable;

public class Administrator implements Serializable {
    private String adminEmail;
    private String adminID;
    private String adminFirstName;
    private String adminLastName;
    private String adminPassword;
    private AdminAddress adminAddress;

    public String getAdminEmail() {
        return adminEmail;
    }

    public String getAdminID() {
        return adminID;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public AdminAddress getAdminAddress() {
        return adminAddress;
    }

    public Administrator(){
        AdminContact adminContact = new AdminContact();
    }

    public Administrator(Builder builder) {
        this.adminEmail = builder.adminEmail;
        this.adminID = builder.adminID;
        this.adminFirstName = builder.adminFirstName;
        this.adminLastName = builder.adminLastName;
        this.adminPassword = builder.adminPassword;
        this.adminAddress = builder.adminAddress;
    }

    public static class Builder {
        private String adminEmail;
        private String adminID;
        private String adminFirstName;
        private String adminLastName;
        private String adminPassword;
        private AdminAddress adminAddress;

        public Builder adminEmail(String value) {
            this.adminEmail = value;
            return this;
        }

        public Builder adminID(String value) {
            this.adminID = value;
            return this;
        }

        public Builder adminFirstName(String value) {
            this.adminFirstName = value;
            return this;
        }

        public Builder adminLastName(String value) {
            this.adminLastName = value;
            return this;
        }

        public Builder adminPassword(String value) {
            this.adminPassword = value;
            return this;
        }

        public Builder adminAddress(AdminAddress value) {
            this.adminAddress = value;
            return this;
        }

        public Administrator build() {
            return new Administrator(this);
        }
    }
}
