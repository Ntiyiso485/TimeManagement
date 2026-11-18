package org.example.todotask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ToDoTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoTaskApplication.class, args);
    }

}
