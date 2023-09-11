package com.example.ExceptionTest.Service;

import com.example.ExceptionTest.Entity.UserRegistration;

import java.util.List;

public interface UserService {
    UserRegistration saveUser(UserRegistration ureg);
    List<UserRegistration> getUser();

}
