/**
 * Created by bobert on 6/4/17.
 */

package com.javafortesters.chap010introducingcollections.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

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

        
    }

}
