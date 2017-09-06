package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by whilemouse on 17. 9. 6.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

}
