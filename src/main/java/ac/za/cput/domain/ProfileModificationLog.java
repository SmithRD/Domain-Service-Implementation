package ac.za.cput.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ProfileModificationLog implements Serializable {

    @Id
    private String logID;
    private String profileType;
    private Date dateOfModification;
    private String reasonForModification;
    @ManyToOne
    private User user;
    @ManyToOne
    private FoodInfo foodInfo;
    @ManyToOne
    private Restaurant restaurant;
    @ManyToOne
    private Administrator administrator;


    public String getLogID() {
        return logID;
    }

    public String getProfileType() {
        return profileType;
    }

    public Date getDateOfModification() {
        return dateOfModification;
    }

    public String getReasonForModification() {
        return reasonForModification;
    }

    public ProfileModificationLog() {

    }

    public ProfileModificationLog(Builder builder) {
        this.logID = builder.logID;
        this.profileType = builder.profileType;
        this.dateOfModification = builder.dateOfModification;
        this.reasonForModification = builder.reasonForModification;
    }

    public static class Builder {
        private String logID;
        private String profileType;
        private Date dateOfModification;
        private String reasonForModification;

        public Builder logID(String value) {
            this.logID = value;
            return this;
        }

        public Builder profileType(String value) {
            this.profileType = value;
            return this;
        }

        public Builder dateOfModification(Date value) {
            this.dateOfModification = value;
            return this;
        }

        public Builder reasonForModification(String value) {
            this.reasonForModification = value;
            return this;
        }

        public ProfileModificationLog build() {
            return new ProfileModificationLog(this);
        }


    }
    }
