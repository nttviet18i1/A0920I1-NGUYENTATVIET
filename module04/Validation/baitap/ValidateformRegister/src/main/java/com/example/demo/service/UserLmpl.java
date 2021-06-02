package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLmpl implements  IUserService{
@Autowired
    IUserRepository iUserRepository;

    @Override
    public void saveUser(User user) {
        iUserRepository.save(user);
    }
}
