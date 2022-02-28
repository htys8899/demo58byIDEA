package cn.data58.demo58;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstController228 {
    @RequestMapping("/mf")  // http://localhost:8080/mf
    public String index() {
        return "start_page228";
    }
}
