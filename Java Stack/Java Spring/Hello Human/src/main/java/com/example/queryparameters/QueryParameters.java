package com.example.queryparameters;

import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;
@RestController
public class QueryParameters {
    @RequestMapping("/")
    public String Hello() {
        return "Hello humen";
    }

    @RequestMapping("/name")
    public String index(@RequestParam(value = "fn") String nameQuery) {
        return "Hello : " + nameQuery;
    }

    @RequestMapping("/name")
    public String fname(@RequestParam(value = "ln") String lastQuery) {
        return "Hello : " + lastQuery;
    }
}