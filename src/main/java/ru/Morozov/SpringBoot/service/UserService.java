package ru.Morozov.SpringBoot.service;

import ru.Morozov.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    User getUser(int id);

    void addUser(User user);

    void deleteUser(int id);

    void editUser(User user);
}