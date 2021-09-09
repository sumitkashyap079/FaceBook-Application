package com.facebook.FaceBook_Application.repository;

import com.facebook.FaceBook_Application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
