package com.conference.controller;

import com.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.desktop.SystemSleepEvent;

@Controller
public class RegistrationController {

    @GetMapping(value="/registration")
    public String registration(@ModelAttribute ("registration")Registration registration)
    {

        System.out.println("get");
        return "registration";
    }

    @PostMapping(value="/registration")
    public String addRegistration(@ModelAttribute ("registration")Registration registration)
    {
        System.out.println("post" + registration.getName());
        return "registration";
    }


}
