package com.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @RequestMapping(value="/greeting")
    public  String greetingPage(Map<String,Object> model)

    {
        model.put("message","Test");
        return "greeting";
    }
@RequestMapping(value="/")
    public  String index()
    {
        return "index";
    }

}
