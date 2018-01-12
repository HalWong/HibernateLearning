package cn.cyphertech.restfulormtest;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Hello greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Hello();
    }
    
    @RequestMapping(value = "/hello", method = RequestMethod.POST, consumes = "application/*")
    public Hello postGreeting(@RequestBody Hello guy) {
        return guy;
    }
}
