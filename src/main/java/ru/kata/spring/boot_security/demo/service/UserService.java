package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;


public interface UserService {
    public void insertUser(User user);
    public void deleteUser(Long id);
    public List<User> getAllUsers();
    public User getUserById(Long id);
    void updateUser(User user, Long id);
}