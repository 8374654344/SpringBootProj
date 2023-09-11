package com.example.ExceptionTest.Controller;

import com.example.ExceptionTest.Entity.UserRegistration;
import com.example.ExceptionTest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<UserRegistration> getUser() {
        return userService.getUser();
    }
    @PostMapping("/user")
    public UserRegistration addUser(@RequestBody UserRegistration ureg) {
        return userService.saveUser(ureg);
    }
}
