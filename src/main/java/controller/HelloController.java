package controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {


//    @GetMapping("/hello")
//    public String hello(){
//        return "Greetings from Spring Boot!";
//    }
//    localhost:8081/hello

    @GetMapping("/hello/{myName}")
    public String helloYou(@PathVariable String myName) {
        return "Hello " + myName;
    }
//    http://localhost:8081/hello/trevor


    @GetMapping("/hello")
    public String hello(@RequestParam(name = "myName"
            , required = false) String myName) {
        return "Hello from " + myName;
    }
//    http://localhost:8081/hello?myName=Trevor


}
