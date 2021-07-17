package com.example.apollospringboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动 ./demo.sh start
 * 关闭 ./demo.sh stop
 */
@SpringBootApplication
public class ApolloSpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloSpringbootTestApplication.class, args);
    }

}
