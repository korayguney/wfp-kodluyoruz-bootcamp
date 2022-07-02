package dev.patika.patika03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name, @RequestParam int year) {
        return "Hello " + name + " , from " + year;
    }

}
