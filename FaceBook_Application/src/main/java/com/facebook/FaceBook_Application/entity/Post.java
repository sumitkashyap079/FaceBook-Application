package com.facebook.FaceBook_Application.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String likeOnPost;
    private String comment;
    private String share;

    public Post() {
    }

    public Post(int pid, String likeOnPost, String comment, String share) {
        this.pid = pid;
        this.likeOnPost = likeOnPost;
        this.comment = comment;
        this.share = share;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getLikeOnPost() {
        return likeOnPost;
    }

    public void setLikeOnPost(String likeOnPost) {
        this.likeOnPost = likeOnPost;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
}
