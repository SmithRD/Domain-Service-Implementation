package ac.za.cput.factories;

import ac.za.cput.domain.User;

import java.util.Date;
import java.util.HashMap;

/**
 *
 */
public class UserFactory {
    public static User buildUser(String userEmail, String userScreenName, String userPassword, Date userSignUpDate,Long contributionCounter, String contributionStatus){
        User user = new User.Builder()
                .userEmail(userEmail)
                .userScreenName(userScreenName)
                .userPassword(userPassword)
                .userSignUpDate(userSignUpDate)
                .contributionCounter(contributionCounter)
                .contributionStatus(contributionStatus)
                .build();
        return user;

    }
}
