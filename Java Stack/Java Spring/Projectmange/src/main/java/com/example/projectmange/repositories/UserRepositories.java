package com.example.projectmange.repositories;

import com.example.projectmange.models.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserRepositories  extends CrudRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
        }

