package com.example.getmesocial.repoistery;

import com.example.getmesocial.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {
    public User getUser() {
        User user=new User("gagan","Surrey",30,"hh/jj/cc");
        return user;
    }
}
