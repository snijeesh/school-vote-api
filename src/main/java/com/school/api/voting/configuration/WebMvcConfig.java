package com.school.api.voting.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/graphql/**")
                .allowedOriginPatterns("*")
                .allowedOrigins("http://localhost:3000")
                .allowedHeaders("*")
                .allowedMethods("*")
                .exposedHeaders("Authorization");
    }
}
