package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tom on 03/02/2017.
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldRestController {


    public String hello() {
        return "hello world";
    }

}
