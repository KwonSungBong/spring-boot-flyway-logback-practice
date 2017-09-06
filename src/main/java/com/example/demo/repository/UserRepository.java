package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by whilemouse on 17. 9. 6.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
