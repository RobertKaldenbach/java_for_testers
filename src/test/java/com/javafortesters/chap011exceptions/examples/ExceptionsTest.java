/**
 * Created by bobert on 6/5/17.
 */

package com.javafortesters.chap011exceptions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsTest {


    @Test
    public void throwANullPointerException(){
        Integer age=18;

        String ageAsString=age.toString();

        String yourAge= "You are "+ ageAsString+" years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchANullPointerException(){
        Integer age = null;
        String ageAsString;


        try{
            ageAsString = age.toString();

        }
        catch(NullPointerException e){
            age = 18;
            ageAsString = age.toString();

            System.out.println("getMessage - "+e.getMessage());
            System.out.println("getStackTrace -"+e.getStackTrace());
            System.out.println("printStackTrace");
            e.printStackTrace();
        }
        String yourAge = "You are "+age.toString()+" years old";
    }


}
