package com.iskoalmighty.springdemo.model.user;

import com.iskoalmighty.springdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    List<User> getUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
//        user.setCode(generateEmployeeC);
        return userRepository.save(user);
    }

    public Optional<User> getUser(long userId) {
        return userRepository.findById(userId);
    }

    public void updateUser(long userId, User user) {
        user.setId(userId);
        userRepository.save(user);
    }
}
