package cn.data58.demo58;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
@SpringBootApplication
public class Demo58Application {

    public static void main(String[] args) {


        SpringApplication.run(Demo58Application.class, args);

        Demo58Application t = new Demo58Application();


        t.parseMethod(SayHello126.class);

        System.out.println("227 github push far test 11:18/23:40/0:30  run by IDEA in ZhuoEr+ parseMethod");
    }



    public void parseMethod(Class<?> clazz) {
        // TODO Auto-generated method stub
        Object obj;
        try {
            obj = clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
            for (Method method : clazz.getDeclaredMethods()) {
                HelloWorld126 say = method.getAnnotation(HelloWorld126.class);
//			String name = "in main name ";
                if (say != null) {
                    String name = say.name();
                    System.out.println(name);
                    method.invoke(obj, name);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//	System.out.println("say something 1");
    }

    @RequestMapping(value = "/h20")
    public String Demo58Controller11() {
        return "Hello World! hyh 222-326";
        // localhost:8080/h20  ; 228 add, test firefox 只能取到return的 String结果
    }


}
