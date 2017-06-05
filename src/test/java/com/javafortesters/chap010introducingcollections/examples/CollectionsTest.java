/**
 * Created by bobert on 6/4/17.
 */

package com.javafortesters.chap010introducingcollections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CollectionsTest {

    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero","one","two","three"};

        for(String numberText : numbers0123){
            System.out.println(numberText);
        }
        assertEquals("zero",numbers0123[0]);
        assertEquals("three",numbers0123[3]);
    }

    @Test
    public void simpleCollectionExample(){
        String[] numbers0123Array = {"zero","one","two","three"};
        List<String> numbers0123 = Arrays.asList(numbers0123Array);

        for(String numbertext : numbers0123){
            System.out.println(numbertext);
        }

        assertEquals("zero",numbers0123.get(0));
        assertEquals("three",numbers0123.get(3));
    }

    @Test
    public void simpleDynamicCollectionExample(){
        List<String> numbers0123 = new ArrayList<String>();

        numbers0123.add("zero");
        numbers0123.add("one");
        numbers0123.add("two");
        numbers0123.add("three");

        for(String numberText : numbers0123){
            System.out.println(numberText);
        }

        assertEquals("zero",numbers0123.get(0));
        assertEquals("three",numbers0123.get(3));
    }

    @Test
    public void iterateDaysOfWeekUsingWhile(){
        //Create Array of Days of Week
        String[] someDays={"Tuesday","Thursday","Wednesday","Monday","Saturday","Friday"};

        //Convert Array to List Collection
        List<String> days = Arrays.asList(someDays);

        int i = 0;

        while (!days.get(i).equals("Monday")){
        i++;
        }
        assertEquals(3,i);

    }

    @Test
    public void iterateDaysOfWeekUsingFor(){
        //Create Array of Days of Week
        String[] someDays={"Tuesday","Thursday","Wednesday","Monday","Saturday","Friday"};

        //Convert Array to List Collection
        List<String> days = Arrays.asList(someDays);
        int i;
        for(i = 0; !days.get(i).equals("Monday");i++){
        }
        assertEquals(3,i);
    }

    @Test
    public void createAndManipulateCollectionOfUsers() {
        //Create Collection1
        Collection<User> usersListA = new ArrayList<User>();

        //Check that is empty
        assertEquals(0, usersListA.size());
        assertTrue(usersListA.isEmpty());

        //Create Two Test Users
        for (int i = 0; i <= 1; i++) {
            usersListA.add(new User("User" + i, "Password" + i));
        }

        //Assert that isn't empty two users
        assertEquals(2, usersListA.size());
        assertFalse(usersListA.isEmpty());

        //Create Second Collection
        Collection<User> userListB = new ArrayList<User>();

        //Assert that Second Collection is empty
        assertEquals(0, userListB.size());
        assertTrue(userListB.isEmpty());

        //Add new users for Collection B
        for (int i = 3; i <= 4; i++) {
            userListB.add(new User("User" + i, "Password" + i));
        }

        //Check that they were properly added
        assertEquals(2, userListB.size());
        assertFalse(userListB.isEmpty());

        //Add userlist B to Userlist A
        usersListA.addAll(userListB);

        //Check that they were added properly
        assertEquals(4,usersListA.size());
        assertTrue(usersListA.containsAll(userListB));

        //Remove all objects from user list B
        usersListA.removeAll(userListB);


        assertEquals(2, usersListA.size());
        assertFalse(usersListA.containsAll(userListB));

        //Empty userListA
        usersListA.clear();
        assertEquals(0,usersListA.size());
        assertTrue(usersListA.isEmpty());
    }

    @Test
    public void createListOfUsers(){
        List<User> userList = new ArrayList<>();

        assertEquals(0,userList.size());
        assertTrue(userList.isEmpty());

            User userA = new User("userA", "PasswordA");
            User userB = new User("userB","PasswordB");


        userList.add(userA);

        assertFalse(userList.isEmpty());
        assertEquals("userA",userList.get(0).getUsername());

        userList.add(0, userB);

        assertEquals(2, userList.size());
        assertEquals("userB",userList.get(0).getUsername());
        assertEquals("userA",userList.get(1).getUsername());

        userList.remove(0);

        assertEquals(1,userList.size());
        assertEquals("userA",userList.get(0).getUsername());





    }
}
