
/**
 * Created by bobert on 6/4/17.
 */

package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SelectionsAndDecisionsTest {

    @Test
    public void moreTernary(){

        String url = "www.eviltester.com";

        url = url.startsWith("http:") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com",url);

    }

    private String addHttp(String url){
        return "http://" + url;
    }

    @Test
    public void canProperlySelectCatOrCats(){

        assertEquals("expected cats","cats",catOrCats(2));

        assertEquals("expected cat","cat",catOrCats(1));
    }

    private String catOrCats(int i) {
        return i>1 ? "cats":"cat";
    }

    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(!url.startsWith("http:")){
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com",url);

    }

    @Test
    public void truthyIsTrue(){
        boolean truthy = true;

        if(truthy == true) assertTrue(truthy);
    }

    @Test public void truthyIsTrueOrNotTrue(){
        boolean truthy = true;
        if (truthy == true){
            assertTrue(truthy);

        }
        assertFalse(!truthy);
    }

    @Test
    public void ifElseAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(url.startsWith("http")){
            //do nothing
        }else{
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com",url);
    }

    @Test
    public void ifTrueAssertTrue(){
        boolean truthy = false;
        if (truthy == true)
            assertTrue(truthy);
        else
        assertFalse(truthy);
    }

    @Test public void ifElseTruthy(){
        boolean truthy = true;

        if (truthy == true){
            assertTrue(truthy);
            assertFalse(!truthy);
        }else{
            assertFalse(truthy);
        }

    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "seleniumsimplified.com";
        if (url.startsWith("http")) {
        //Do Nothing
        }else {
            if (!url.startsWith("www")) {
                url = "www."+url;

            }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com",url);
    }

    @Test
    public void nestedIfElseHorror(){
        boolean truthy = false;
        boolean falsey = true;

        if(truthy){
            if(!falsey){
                if(truthy && !falsey){
                    if(falsey || truthy){
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            }else{
                assertTrue(truthy);
                assertFalse(falsey);
            }
        }else{
            if(!truthy){
                if(falsey){
                    assertTrue(falsey);
                    assertFalse(truthy);
                }
                else{
                    assertFalse(falsey);
                    assertFalse(truthy);
                }
            }
        }
    }


    @Test
    public void switchExample(){
        assertEquals("M",likelyGenderIs("sir"));
        assertEquals("M",likelyGenderIs("mr"));
        assertEquals("M",likelyGenderIs("master"));
        assertEquals("F",likelyGenderIs("miss"));
        assertEquals("F",likelyGenderIs("mrs"));
        assertEquals("F",likelyGenderIs("ms"));
        assertEquals("F",likelyGenderIs("lady"));
        assertEquals("F",likelyGenderIs("madam"));
    }

    public String likelyGenderIs(String title){
        String likelyGender;

        switch(title.toLowerCase()){
            case"sir":
                likelyGender = "M";
                break;
            case"mr":
                likelyGender="M";
                break;
            case"master":
                likelyGender="M";
                break;
            default:
                likelyGender = "F";
                break;
        }

        return likelyGender;
    }


    @Test
    public void fullCountryNameSwitchTest(){
        assertEquals("United Kingdom",fullCountryName("UK"));
        assertEquals("United States",fullCountryName("US"));
        assertEquals("United States",fullCountryName("USA"));
        assertEquals("France",fullCountryName("FR"));
        assertEquals("Sweden",fullCountryName("SE"));
        assertEquals("Rest of World",fullCountryName("CD"));
    }

    private String fullCountryName(String shortName) {
        String fullCountryName;

        switch(shortName.toUpperCase()){
            case"US":
            case"USA":
                fullCountryName="United States";
                break;
            case"UK":
                fullCountryName="United Kingdom";
                break;
            case"FR":
                fullCountryName="France";
                break;
            case"SE":
                fullCountryName="Sweden";
                break;
            default:
                fullCountryName="Rest of World";
                break;
        }
        return fullCountryName;

    }

    @Test
    public void switchOnIntTest(){
        assertEquals("One",switchOnInt(1));
        assertEquals("Two",switchOnInt(2));
        assertEquals("Three",switchOnInt(3));
        assertEquals("Four",switchOnInt(4));
        assertEquals("Too Big",switchOnInt(5));
        assertEquals("Too Small",switchOnInt(0));
    }

    private String switchOnInt(int input) {
        switch (input){
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            default:
                if(input < 1){
                    return "Too Small";
                }else if(input >4){
                    return "Too Big";
                }
        }
return"Failure";
    }

}
