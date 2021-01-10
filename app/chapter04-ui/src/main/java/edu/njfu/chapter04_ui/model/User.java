package edu.njfu.chapter04_ui.model;

public class User {
    private String userName;
    private String password;

    public User(String userName,String password){
        this.userName=userName;
        this.password=password;
    }

    public User(){

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
