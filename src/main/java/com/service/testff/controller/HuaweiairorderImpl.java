package com.service.testff.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-27T02:49:40.542Z")

@RestSchema(schemaId = "huaweiairorder")
@RequestMapping(path = "/testff", produces = MediaType.APPLICATION_JSON)
public class HuaweiairorderImpl {

    @Autowired
    private HuaweiairorderDelegate userHuaweiairorderDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHuaweiairorderDelegate.helloworld(name);
    }

}
