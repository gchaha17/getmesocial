package com.example.getmesocial.service;

import com.example.getmesocial.model.User;
import com.example.getmesocial.repoistery.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo u2;
    public User getUser() {
      return  u2.getUser();

    }
}
