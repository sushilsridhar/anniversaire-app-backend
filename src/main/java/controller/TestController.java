package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TestService;

@RestController
@RequestMapping(path = "/test")
public class TestController {

    @Autowired
    TestService service;

    //GET TEST
    @RequestMapping(path = "/get")
    public String Test()
    {
        return service.Test();
    }
}
