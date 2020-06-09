package com.example.helloapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.Principal;
import java.util.Collection;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hellos")
    Collection<Hello> hello(Principal principal) {
        return null;
    }

    @GetMapping("/hello/{id}")
    ResponseEntity<?> getHello(@PathVariable Long id) {
        Hello note =  new Hello(id, "Hello to you " + id + "!");
        return ResponseEntity.ok().body(note);
    }

    @PostMapping("/hello")
    ResponseEntity<Hello> createHello(@RequestBody Hello hello) throws URISyntaxException {
        log.info("Request to create note: {}", hello);

        return ResponseEntity.created(new URI("/api/note/" + hello.getId()))
                .body(hello);
    }


    @PutMapping("/hello/{id}")
    ResponseEntity<Hello> updateHello(@RequestBody Hello hello) {
        log.info("Request to update group: {}", hello);
        return ResponseEntity.ok().body(hello);
    }

    @DeleteMapping("/hello/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}