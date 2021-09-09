package com.facebook.FaceBook_Application.service;

import com.facebook.FaceBook_Application.entity.User;
import com.facebook.FaceBook_Application.repository.PostRepo;
import com.facebook.FaceBook_Application.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PostRepo postRepo;


    public List<User> findAllUser() { return userRepo.findAll();
    }

    public String saveUser(User user) {
        userRepo.save(user);
        postRepo.saveAll(user.getPosts());
        return "added";
    }
}
