package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User user = new User("TestName", "TestLastName");
        String json = new Gson().toJson(user);
        System.out.println(json);
    }
}

class User {
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
