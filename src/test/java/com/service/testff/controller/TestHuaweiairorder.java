package com.service.testff.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHuaweiairorder {

        HuaweiairorderDelegate huaweiairorderDelegate = new HuaweiairorderDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = huaweiairorderDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}