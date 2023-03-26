package com.gangulewan.eggservicer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.gangulewan.eggservice")
public class EggServicerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EggServicerApplication.class, args);
    }

}
