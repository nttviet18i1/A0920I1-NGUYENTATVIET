package com.codegym.a09.service.lmlp;

import com.codegym.a09.model.User;
import com.codegym.a09.repository.UserRepository;
import com.codegym.a09.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUser {
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
