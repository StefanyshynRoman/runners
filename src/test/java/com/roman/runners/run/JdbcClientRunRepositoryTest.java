package com.roman.runners.run;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@JdbcTest
@Import(JdbcClientRunRepository.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class JdbcClientRunRepositoryTest {
    @Autowired
    JdbcClientRunRepository repository;
//    @Autowired
//    JdbcClient jdbcClient;

    @Test
    void findAll() {
        // Assuming that the database is pre-populated with some data
        List<Run> runs = repository.findAll();
        System.out.println(runs);
        assertNotNull(runs);
      //  assertFalse(runs.isEmpty(), "Expected to find some runs in the database");
    }
    @Test
    void create() {
    }

    @Test
    void count() {
    }

    @Test
    void saveAll() {
    }

}