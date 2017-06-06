package com.javafortesters.domainentities; /**
 * Created by bobert on 6/6/17.
 */

import com.javafortesters.domainentities.User;
import com.javafortesters.domainobject.TestAppEnv;

public class EmptyUser extends User {

    public String getUrl(){
        TestAppEnv test = new TestAppEnv();
        return test.getUrl();
    }
}
