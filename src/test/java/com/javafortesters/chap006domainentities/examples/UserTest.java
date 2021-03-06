/**
 * Created by bobert on 6/3/17.
 */
package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();

    }

    @Test
    public void userHasDefaultUsernameAndPAssword(){
        User user = new User();

        assertEquals("default username expected","username",user.getUsername());

        assertEquals("default password expected","password",user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin","pA550rD");

        assertEquals("given username expected","admin",user.getUsername());

        assertEquals("given password expected","pA550rD",user.getPassword());

    }


    @Test
    public void canChangePasswordAfterConstructed(){
        User user = new User();

        user.setPassword("PaZZwor6");

        assertEquals("setter Password Expected","PaZZwor6",user.getPassword());

    }
}
