package com.Ecommerce.services;
import java.util.List;

import com.Ecommerce.entities.User;
public interface UserService {
	List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
