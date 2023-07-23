package com.example.daikichi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class Daikichi {
    public static void main(String[] args) {
        SpringApplication.run(Daikichi.class, args);
    }


    @RequestMapping("/daikichi/travel/{travel}")
    public String travel(@PathVariable("travel") String travel) {
        return "Congratulations! You will soon travel to  " + travel;
    }

    @RequestMapping("/daikichi/lotto/{number}")
    public String travel(@PathVariable("number") int number) {
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}