package com.huaweiair.controller;

import com.huaweiair.model.Person;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestHuaweiairorder {

    HuaweiairorderImpl huaweiairorderImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        huaweiairorderImpl = BeanUtils.getBean("huaweiairorderImpl");
    }



    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: huaweiairorderImpl.add(Integer a, Integer b)
        Integer returnValue = huaweiairorderImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: huaweiairorderImpl.sayHei(String name)
        String returnValue = huaweiairorderImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: huaweiairorderImpl.sayHello(String name)
        String returnValue = huaweiairorderImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHi(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: huaweiairorderImpl.sayHi(String name)
        String returnValue = huaweiairorderImpl.sayHi(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: huaweiairorderImpl.saySomething(String prefix, Person user)
        String returnValue = huaweiairorderImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }

}



