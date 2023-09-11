package com.example.ExceptionTest.Service;

import com.example.ExceptionTest.Entity.UserRegistration;
import com.example.ExceptionTest.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;


    @Override
    public UserRegistration saveUser(UserRegistration ureg) {
        return userRepo.save(ureg);
    }

    @Override
    public List<UserRegistration> getUser() {
        return userRepo.findAll();
    }
}
