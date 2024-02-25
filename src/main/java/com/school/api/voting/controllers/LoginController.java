package com.school.api.voting.controllers;

import com.school.api.voting.model.User;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Controller
public class LoginController {

    @QueryMapping
    public CompletableFuture<List<User>> login() {
        System.out.println("called...");
        return CompletableFuture.supplyAsync(() -> {
            List<User> list = new ArrayList<User>();
            try {
                var user1 = new User();
                user1.setUserName("admin");
                user1.setPassword("password");
                user1.setName("Admin");
                user1.setRole("admin");
                user1.setToken("testtoken");
                user1.setHome("/admin/home");
                var user2 = new User();
                user2.setUserName("user");
                user2.setPassword("password");
                user2.setName("User");
                user2.setRole("user");
                user2.setToken("testtoken");
                user2.setHome("/user/home");
                list.add(user1);
                list.add(user2);
                return list;
            } catch (Exception ex) {
            }
            return list;
        });
    }
}
