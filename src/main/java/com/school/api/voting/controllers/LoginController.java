package com.school.api.voting.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
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
                ObjectMapper objectMapper = new ObjectMapper();

                var user1 = new User();
                user1.setUserName("admin");
                user1.setPassword("password");
                var user2 = new User();
                user2.setUserName("user");
                user2.setPassword("password");
                list.add(user1);
                list.add(user2);
                return list;
                //return objectMapper.writeValueAsString(list);
            } catch (Exception ex) {
            }
            return list;
//            return "[" +
//                "{userName: \"admin\", password: \"password\", name: \"Admin\", role: \"admin\", token: \"testtoken\"}," +
//                "{userName: \"user\", password: \"password\", name: \"User\", role: \"user\", token: \"testtoken\"}" +
//                "]";
        });
    }
}
