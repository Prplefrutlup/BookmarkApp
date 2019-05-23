package com.prple.bookmark.managers;

import com.prple.bookmark.entities.User;

public class UserManager {

    //manager class that demonstrates singleton pattern
    private static UserManager instance = new UserManager();

    //private constructor to not allow client to instantiate object of manager class
    private UserManager() {
    }

    // used to create a single instance of UserManager
    public static UserManager getInstance() {
        return instance;
    }

    public User createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType) {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUserType(userType);

        return user;
    }
}
