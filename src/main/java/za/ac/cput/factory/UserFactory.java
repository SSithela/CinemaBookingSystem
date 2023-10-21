package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class UserFactory {
    public static User createUser( String name, String surname, String email, String phone){
        if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(surname) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(phone)  || !Helper.isNumeric(phone))
            return null;
        if (Helper.isValidEmail(email)){
            return null;
        }
        return new User.Builder()
                .setName(name)
                .setSurname(surname)
                .setEmail(email)
                .setPhone(phone)
                .build();
    }
}
