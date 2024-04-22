package com.prefinal.prefinalie.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prefinal.prefinalie.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> findByfirstname(String firstname);

    List<User> findBylastname(String lastname);
}
