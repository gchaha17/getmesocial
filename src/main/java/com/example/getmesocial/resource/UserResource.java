package com.example.getmesocial.resource;

import com.example.getmesocial.model.User;
import com.example.getmesocial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {
   @Autowired
    private UserService u1;

    @GetMapping("/user")
    public User getuser()
    {

      return  u1.getUser();
    }
}