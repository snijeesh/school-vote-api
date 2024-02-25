package com.school.api.voting.repository;

import com.school.api.voting.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findUserByUserNameAndPassword(String userName, String password);
}