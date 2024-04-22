package com.prefinal.prefinalie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prefinal.prefinalie.models.Post;
import com.prefinal.prefinalie.service.PostService;

@RestController
@RequestMapping("/post")
@CrossOrigin
public class PostController {

    private final PostService pService;

    @Autowired
    public PostController(PostService pService) {
        this.pService = pService;
    }

    @PostMapping("/newPost")
    public Post addPost(@RequestBody Post p) {
        return pService.addPost(p);
    }

    @GetMapping("/{user_id}/{post_id}")
    public List<Post> getUserbyFirstNameandLastName(@PathVariable Integer id) {
        return pService.getByUserId(id);
    }

}
