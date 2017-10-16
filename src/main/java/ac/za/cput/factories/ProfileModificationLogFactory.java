package ac.za.cput.factories;

import ac.za.cput.domain.ProfileModificationLog;
import ac.za.cput.utility.KeyGenerator;

import java.util.Date;

public class ProfileModificationLogFactory {
    public static ProfileModificationLog buildProfileModificationLog(String profileType, Date dateOfModification, String reasonForModification){
        ProfileModificationLog profileModificationLog = new ProfileModificationLog.Builder()
                .logID(KeyGenerator.getEntityId())
                .profileType(profileType)
                .dateOfModification(dateOfModification)
                .reasonForModification(reasonForModification)
                .build();
        return profileModificationLog;
    }
}
