package com.school.api.voting.controllers;

import com.school.api.voting.model.User;
import com.school.api.voting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @QueryMapping
    public CompletableFuture<Optional<User>> login(@Argument String userName, @Argument String password) {

        return CompletableFuture.supplyAsync(() -> {
            try {
                return userRepository.findUserByUserNameAndPassword(userName, password);
            } catch (Exception ex) {
            }
            return null;
        });
    }
}
