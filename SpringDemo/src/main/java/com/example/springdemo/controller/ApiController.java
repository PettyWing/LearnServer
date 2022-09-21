package com.example.springdemo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping(value = "/api")
    public Api api1() {
        return new Api("api1", "apiController");
    }

    public static class Api {
        private String name;
        private String controller;

        public Api(String name, String controller) {
            this.name = name;
            this.controller = controller;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getController() {
            return controller;
        }

        public void setController(String controller) {
            this.controller = controller;
        }
    }
}
