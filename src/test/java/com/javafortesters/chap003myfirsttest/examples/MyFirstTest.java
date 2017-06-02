/**
 * Created by bobert on 6/1/17.
 */



package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    //Test for 2+2=4
    @Test
    public void canAddTwoPlusTwo(){

        int answer = 2+2;
        assertEquals("2+2=4",4,answer);

    }
    //Test for 2-2=0
    @Test
    public void canSubtractTwoFromTwo(){
        int answer = 2-2;
        assertEquals("2-2=0",0,answer);
    }
    //Test for 4/2=2
    @Test
    public void canDivideFourByTwo(){
        int answer = 4/2;
        assertEquals("4/2=2",2,answer);
    }
    //Test for 2*2=4
    @Test
    public void canMultiplyTwoByTwo(){
        int answer = 2*2;
        assertEquals("2*2=4",4,answer);
    }
}
