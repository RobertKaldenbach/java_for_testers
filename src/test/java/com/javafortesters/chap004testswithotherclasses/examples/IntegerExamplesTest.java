/**
 * Created by bobert on 6/2/17.
 */

package com.javafortesters.chap004testswithotherclasses.examples;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IntegerExamplesTest {

    //Just exploring the Java Integer Class
    @Test
    public void integerExploration(){
        Integer four=new Integer(4);

        assertEquals("intValue returns int 4",4,four.intValue());

        Integer five = new Integer("5");
        assertEquals("int Value returns int 5",5,five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assignment for 6",6,six.intValue());

    }

    //Test Integer static method for int to Hex string
    @Test
    public void intToHex(){

        String test = Integer.toHexString(11);

       // System.out.println(test);
        assertEquals("The Hex of 11 is B","b",Integer.toHexString(11));

        assertEquals("The Hex of 10 is a","a",Integer.toHexString(10));

        assertEquals("The Hex of 3 is 3","3",Integer.toHexString(3));

        assertEquals("The Hex of 21 is 15", "15",Integer.toHexString(21));


    }



}
