package com.roman.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnersApplication {
    private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RunnersApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(RunRepository runRepository) {
//        return args -> {
//            Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
//        runRepository.create(run);
//        };
//
//    }
}
