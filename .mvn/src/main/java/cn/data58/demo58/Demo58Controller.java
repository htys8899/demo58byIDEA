package cn.data58.demo58;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@RestController
public class Demo58Controller {

    //    @GetMapping("/helloworld")
    @RequestMapping(value = "/testnpe")
    public String hello() {
        return "Hello World!";
    }
}