package com.yahoo.adapterdemo;

import java.util.ArrayList;

/**
 * Created by sinze on 7/24/15.
 */
public class User {
    private String name;
    private String hometown;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Emily", "Paris"));
        users.add(new User("John", "London"));
        users.add(new User("Eric", "Taipei"));
        return users;
    }
}
