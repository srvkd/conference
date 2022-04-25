package com.conference.controller;

import com.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public List<User> getUser(@RequestParam (value="firstname",defaultValue = "hello") String firstname)
    {
        User users=new User();
        users.setFirstname(firstname);

        User users1=new User();
        users1.setFirstname("user1");

        List<User> userList=new ArrayList<>();
        userList.add(users);
        userList.add(users1);

        return userList;
    }

}
