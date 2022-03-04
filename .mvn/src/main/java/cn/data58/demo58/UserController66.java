package cn.data58.demo58;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
@Controller
public class UserController66 {

    @RequestMapping(value="/user88")
    public String index(Model model) {
        List<User66> users = new ArrayList<User66>();
        users.add(new User66("皮皮虾228-1", "男", "喜欢皮"));
        users.add(new User66("光头强228-2", "男", "砍树"));
        users.add(new User66("佩奇304-1", "男", "叫"));
        model.addAttribute("users",users);
        return "user66";
    }
}

/* 20210711,如果只把User66.java， UserController.java两个文件copy过来，还是出现提示：
 * 去访问：http://localhost:8080/user88，回应：
 * Whitelabel Error Page
	This application has no explicit mapping for /error, so you are seeing this as a fallback.
	Sun Jul 11 15:39:48 CST 2021
	There was an unexpected error (type=Internal Server Error, status=500).
	Circular view path [user]: would dispatch back to the current handler URL [/user] again. Check your ViewResolver setup!
	(Hint: This may be the result of an unspecified view, due to default view name generation.)
 */
/* 202107111, 就是因为加了user.html，与dependency spring-boot-starter-thymeleaf
 * 皮皮虾的 /user 就客户反馈了
 * 如果从Firefox看源代码，在已经用到了tr,table row， td, table data;
 * 而不是java语句
 */
/* 20210718,如果去掉@controller 或者@RequestMapping(value="/user"), 则：Firefox回应：
 * Whitelabel Error Page
	This application has no explicit mapping for /error, so you are seeing this as a fallback.
	Sun Jul 18 18:45:10 CST 2021
	There was an unexpected error (type=Not Found, status=404).
	No message available*
 */

