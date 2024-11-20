package com.vrs.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vrs.demo.User.User;
import java.util.List;


public interface userRepo extends JpaRepository<User, Integer>
{
     User findByEmail(String email);
}
