package com.kunyk;

import com.kunyk.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.websystique.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class ArticleTaskApp {

    public static void main(String[] args) {
        SpringApplication.run(ArticleTaskApp.class, args);
    }
}