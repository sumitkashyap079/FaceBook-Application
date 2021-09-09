package com.facebook.FaceBook_Application.controller;

import com.facebook.FaceBook_Application.entity.Post;
import com.facebook.FaceBook_Application.entity.User;
import com.facebook.FaceBook_Application.service.PostService;
import com.facebook.FaceBook_Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @PostMapping("/saveuser")
    String saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    List<Post> getPost(){
        return postService.listAll();
    }

}
