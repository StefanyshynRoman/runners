package com.roman.runners;

import com.roman.runners.run.RunRepository;
import com.roman.runners.user.User;
import com.roman.runners.user.UserRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RunnersApplication {
    private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RunnersApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserRestClient userRestClient) {
        return args -> {
            List<User> users=userRestClient.findAll();
            users.forEach(user -> System.out.println(user));
            User user = userRestClient.findById(2);
            System.err.println(user);
        };

    }
}
