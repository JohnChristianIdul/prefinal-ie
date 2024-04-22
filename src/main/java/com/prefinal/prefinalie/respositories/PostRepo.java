package com.prefinal.prefinalie.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prefinal.prefinalie.models.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByuser_id(int id);

    List<Post> findAll();
}
