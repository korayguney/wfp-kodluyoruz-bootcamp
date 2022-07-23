package dev.patika.patika08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/hellodev/{name}")
    public String sayHelloToDeveloper(@PathVariable("name") String name, Model model) {
        model.addAttribute("developername", name);
        model.addAttribute("servertime", LocalDateTime.now());
        return "hellodev";
    }

}
