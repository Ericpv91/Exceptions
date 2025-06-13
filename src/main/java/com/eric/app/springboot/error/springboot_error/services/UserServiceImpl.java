package com.eric.app.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.app.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Eric", "Vallejo"));
        users.add(new User(2L, "Mari", "Canizares"));
        users.add(new User(3L, "Gala", "Galanson"));
        users.add(new User(4L, "Skye", "Skyenson"));
        users.add(new User(5L, "Lilith", "Vallejo"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        User user = null;
        for (User u : users) {
            if(u.getId().equals(id)) {
                user = u;
                break;
            }
        }

        return user;
    }

}
