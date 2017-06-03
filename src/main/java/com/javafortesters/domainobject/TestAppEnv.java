package com.javafortesters.domainobject;

/**
 * Created by bobert on 6/3/17.
 */
public class TestAppEnv {
    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
        return "http://"+DOMAIN+":"+PORT;
    }

}
