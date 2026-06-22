package com.library.model;

public class User {
    
    private int userId;
    private String name;
    private String email;
    private String phoneno;


    public User(){

    }

    public User(int userId, String name, String email, String phoneno){
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
    }

    public int getuserId(){
        return userId;
    }
    public void setuserId(int userId){
        this.userId = userId;
    }


    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }


    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email = email;
    }


    public String getphoneno(){
        return phoneno;
    }
    public void setphoneno(String phoneno){
        this.phoneno = phoneno;
    }


    @Override
    public String toString(){
        return "User{" +
                    "userId=" + userId +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneno='" + phoneno + '\'' +
                    '}';

    }
}

