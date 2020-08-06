package learnraspberry.dw.org.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> helloWorld(@PathVariable("name") String name) {
        return ResponseEntity.ok().body("Hello " + name);
    }
}