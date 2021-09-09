package com.facebook.FaceBook_Application.service;

import com.facebook.FaceBook_Application.entity.Post;
import com.facebook.FaceBook_Application.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;



    public List<Post> listAll() {
        return postRepo.findAll();
    }

}
