package com.example.ExceptionTest.Repository;

import com.example.ExceptionTest.Entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserRegistration, Long> {


}
