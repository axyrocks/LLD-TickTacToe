package com.dev.tictactoe.models;

public class User {

    private int userId;
    private String email;
    private String password;
    private String mobile;

    public User(int userId, String email, String password, String mobile) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
