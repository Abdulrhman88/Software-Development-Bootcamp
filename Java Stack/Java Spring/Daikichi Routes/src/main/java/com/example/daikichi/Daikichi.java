package com.example.daikichi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class Daikichi {
    public static void main(String[] args) {
        SpringApplication.run(Daikichi.class, args);
    }

    // 1. Annotation
    @RequestMapping("/daikichi")
    // 3. Method that maps to the request route above
    public String hello() { // 3
        return "daikichi";
    }

    @RequestMapping("/daikichi/today")
    public String today(){
        return "today you will find luck in all your endvers";
    }
    @RequestMapping("/daikichi/tomorrow")
    public String tomorrow(){
        return "tomorrow an opprtunity will arse . so be sure to be open to new ides";
    }
}