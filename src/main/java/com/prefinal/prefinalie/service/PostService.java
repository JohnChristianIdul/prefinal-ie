package com.prefinal.prefinalie.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.prefinal.prefinalie.models.Post;
import com.prefinal.prefinalie.respositories.PostRepo;

@Service
public class PostService {
    private final PostRepo pRepo;

    @Autowired
    public PostService(PostRepo pRepo) {
        this.pRepo = pRepo;
    }

    public Post addPost(Post p) {
        return pRepo.save(p);
    }

    public List<Post> getByUserId(Integer Id) {
        return pRepo.findByuser_id(Id);
    }

}
