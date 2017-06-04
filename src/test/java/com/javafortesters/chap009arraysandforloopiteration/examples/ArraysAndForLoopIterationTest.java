/**
 * Created by bobert on 6/4/17.
 */

package com.javafortesters.chap009arraysandforloopiteration.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArraysAndForLoopIterationTest {

    @Test
    public void simpleArrayExample() {
        String[] numbers01234 = {"zero", "one", "two", "three"};

        for (String numberText : numbers01234) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers01234[0]);
        assertEquals("three", numbers01234[3]);
    }


    //create an array that contains three users

    @Test
    public void arrayOfUsers() {

        User[] arrayOfUsers = new User[3];
        arrayOfUsers[0] = new User("User1", "Pass1");
        arrayOfUsers[1] = new User("User2", "Pass2");
        arrayOfUsers[2] = new User("User3", "Pass3");

        int i = 1;

        for (User user : arrayOfUsers) {
            assertEquals("User" + i, user.getUsername());
            System.out.println(user.getUsername());
            i++;
        }


        for (User user : arrayOfUsers) {
            System.out.println(user.getUsername());

        }
    }

    @Test
    public void create100TestUsers(){
        User[] arrayOfUsers = new User[100];

        for(int i = 0; i <100;i++){
            arrayOfUsers[i] = new User("User"+i,"Password"+i);
        }


        int i = 0;
        for(User user: arrayOfUsers){

            System.out.println("User: "+user.getUsername()+" Password: "+user.getPassword());
            assertEquals("User"+i,user.getUsername());
            assertEquals("Password"+i,user.getPassword());
            i++;
        }
        assertEquals("Expected 100 Users",100,arrayOfUsers.length);
    }

    @Test
    public void setAndSortWorkdaysArray(){

        String[] workdays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};

        Arrays.sort(workdays);

        assertEquals("Friday",workdays[0]);
        assertEquals("Monday",workdays[1]);
        assertEquals("Thursday",workdays[2]);
        assertEquals("Tuesday",workdays[3]);
        assertEquals("Wednesday",workdays[4]);

    }

    @Test
    public void setMixedWorkdaysArray(){
        String[] workdays = {"monday","Tuesday","Wednesday","thursday","Friday"};

        Arrays.sort(workdays);

        assertEquals("Friday",workdays[0]);
        assertEquals("Tuesday",workdays[1]);
        assertEquals("Wednesday",workdays[2]);
        assertEquals("monday",workdays[3]);
        assertEquals("thursday",workdays[4]);


    }

    public void print2DIntArray(int [][]multi){
        for(int[] outer:multi){
            if(outer==null){
                System.out.print("null");
            }else{
                for(int inner: outer){
                    System.out.print((inner + ","));
                }
            }
            System.out.println(" ");
        }
    }

    @Test
    public void create2DTriangleArray(){
        int [][] triangle = new int[16][];

        for(int row = 0; row<triangle.length;row++){
            triangle[row] = new int[row +1];
            for(int i = 0; i<row+1;i++){
                triangle[row][i]=1;
            }
        }
    }



}
