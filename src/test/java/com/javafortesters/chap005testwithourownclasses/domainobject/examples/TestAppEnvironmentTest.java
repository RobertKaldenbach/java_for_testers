/**
 * Created by bobert on 6/3/17.
 */

package com.javafortesters.chap005testwithourownclasses.domainobject.examples;


import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {

        assertEquals("URL should be http://192.123.0.3:67", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }
}
