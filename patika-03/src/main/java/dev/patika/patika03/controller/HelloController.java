package dev.patika.patika03.controller;

import dev.patika.patika03.StringResponse;
import dev.patika.patika03.Student;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    // endpoint
    //@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    @RequestMapping(value = "/hello")
    public StringResponse sayHello(@RequestParam(required = false) String name, @RequestParam int year) {
        return new StringResponse("Hello " + name + " , from " + year);
    }

    @RequestMapping( value = {"/hello/{name}","/hello/{name}/{year}"})
    @ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "There is an error during request...")
    public String sayMyName(@PathVariable(required = false) String name, @PathVariable(required = false) int year) {
        return "Hello " + name + " , from " + year;
    }

    @GetMapping("/greeting/{id}")
    public ResponseEntity<String> greeting(@RequestHeader("Cookie") String cookie,  @PathVariable int id) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("my-custom-header", "Test header");

        return new ResponseEntity<>("Id : " + id + " , cookie: " + cookie, headers, HttpStatus.OK);
        //return ResponseEntity.ok().body("Id : " + id + " , cookie: " + cookie);
       // return ResponseEntity.status(HttpStatus.ACCEPTED).body("Id : " + id + " , cookie: " + cookie);
    }

    @GetMapping("/custom")
    public void customHeader(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String cookie  = request.getHeader("cookie");

        response.setHeader("custom-header", "Koray");
        response.setHeader("cookie" , cookie +"patikadev");
        response.setStatus(201);
        response.getWriter().println("Hello World...");
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Koray Guney", 38));
        students.add(new Student(2, "Ali Veli", 23));
        students.add(new Student(3, "Hasan Huseyin", 27));

        return ResponseEntity.ok().body(students);
    }

    @GetMapping("*")
    public ResponseEntity<String> fallBackMethod(){
        return new ResponseEntity<>("There is no endpoint like that!...", HttpStatus.NOT_FOUND);
    }

    // http://localhost:8080/sum?num1=10&num2=20
    // output ---->   10+20=30
    // test
    @GetMapping("/calculate/{operation}")
    public String calculate(String operation, int num1, int num2) {
        return null;
    }

}
