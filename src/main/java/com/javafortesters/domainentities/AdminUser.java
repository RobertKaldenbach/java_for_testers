package com.javafortesters.domainentities;

import com.javafortesters.domainentities.User;

/**
 * Created by bobert on 6/6/17.
 */
public class AdminUser extends User {

    public AdminUser(){
        this("adminuser","password");
    }

    public AdminUser(String username, String password){
        super(username,password);
    }

    @Override
    public String getPermission(){
        return "Elevated";
    }

}
