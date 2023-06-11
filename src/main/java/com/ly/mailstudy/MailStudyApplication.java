package com.ly.mailstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ly.mailstudy.mapper")
public class MailStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailStudyApplication.class, args);
    }

}
