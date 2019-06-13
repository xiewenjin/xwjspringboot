package net.xwjclass.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.xwjclass.demo.mapper")
public class XwjclassApplication {

    public static void main(String[] args) {
        SpringApplication.run(XwjclassApplication.class, args);
    }

}
