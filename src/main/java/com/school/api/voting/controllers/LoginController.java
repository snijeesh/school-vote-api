package com.school.api.voting.controllers;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.concurrent.CompletableFuture;

@Controller
public class LoginController {

    @QueryMapping
    public CompletableFuture<String> login() {
        System.out.println("called...");
        return CompletableFuture.supplyAsync(() -> {return "done";});
    }

}
