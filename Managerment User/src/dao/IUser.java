package dao;

import model.User;

import java.util.List;

public interface IUser {
    void insertUser(User user);
   User getUser(int id);
    List<User> getAllUser();
    void updateUser(User user);
    void deleteUser(String id);
}
