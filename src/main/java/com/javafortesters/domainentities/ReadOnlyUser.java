package com.javafortesters.domainentities;

/**
 * Created by bobert on 6/6/17.
 */
public class ReadOnlyUser extends User {
    @Override
    public String getPermission(){
        return "ReadOnly";
    }
}
