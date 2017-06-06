/**
 * Created by bobert on 6/6/17.
 */
package com.javafortesters.chap012introducintinheritance;

import com.javafortesters.domainentities.AdminUser;
import com.javafortesters.domainentities.EmptyUser;
import com.javafortesters.domainentities.User;
import com.javafortesters.domainentities.ReadOnlyUser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceIntro {

    @Test
    public void emptyUserExample(){

        EmptyUser enu = new EmptyUser();
        assertEquals("username",enu.getUsername());
        assertEquals("password",enu.getPassword());
    }

    @Test
    public void emptyUserGetUrl(){
        EmptyUser enu = new EmptyUser();
        assertEquals("http://192.123.0.3:67",enu.getUrl());
    }

    @Test
    public void aUserHasnormalPermissions(){
        User aUser = new User();
        assertEquals("Normal",aUser.getPermission());
    }

    @Test
    public void aAdminUserHasElevatedPermissions(){
        AdminUser adminUser = new AdminUser();
        assertEquals("Elevated",adminUser.getPermission());
    }

    @Test
    public void anAdminUserDefaultConstructor(){
        AdminUser admin = new AdminUser();
        assertEquals("adminuser",admin.getUsername());
        assertEquals("password",admin.getPassword());
        assertEquals("Elevated",admin.getPermission());
    }

    @Test
    public void aReadOnlyUserHasReadOnlyPermissions(){
        ReadOnlyUser aReadOnlyUser = new ReadOnlyUser();
        assertEquals("username",aReadOnlyUser.getUsername());
        assertEquals("password",aReadOnlyUser.getPassword());
        assertEquals("ReadOnly",aReadOnlyUser.getPermission());
    }

}
