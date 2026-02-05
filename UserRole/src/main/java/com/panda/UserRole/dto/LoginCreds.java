package com.panda.UserRole.dto;

public class LoginCreds {
    private final String userName;
    private final String passWord;

    public LoginCreds(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName(){return this.userName;}
    public String getPassWord(){return this.passWord;}
}
