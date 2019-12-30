package com.wail.cms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping(value = "/hello")
    public String sayHelloWorld()
    {
        return "Hello World";

    }
}
