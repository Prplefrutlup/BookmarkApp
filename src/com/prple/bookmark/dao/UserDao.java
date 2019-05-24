package com.prple.bookmark.dao;

import com.prple.bookmark.DataStore;
import com.prple.bookmark.entities.User;

public class UserDao {

    public User[] getUsers() {
        return DataStore.getUsers();
    }
}
