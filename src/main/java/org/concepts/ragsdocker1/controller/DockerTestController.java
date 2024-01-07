package org.concepts.ragsdocker1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerTestController {
    @GetMapping
    public String hello() {
        return "Hello World! Docker Changes";
    }
}
