package com.stlpg.MachineMaintenance.models;


public class User {

    private String userFirstName;

    private String userLastName;

    private String password;

    public User() {
    }

    public User(String userFirstName, String userLastName, String password) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.password = password;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
