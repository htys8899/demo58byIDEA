package cn.data58.demo58;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 如果没有下面注释，则报错：org.springframework.context.ApplicationContextException: Unable to start web server

@SpringBootApplication
public class InterfaceTest303 implements Interface303 {

    public static void main(String[] args) {
        SpringApplication.run(InterfaceTest303.class, args);
        InterfaceTest303 test = new InterfaceTest303();
        test.facemethod1("the interface method 20220303");
        test.inoverride1("over11");
    }

    @Override
    public void inoverride1(String strover1) {
        // TODO Auto-generated method stub
        System.out.println("implement the method in interface1 " + strover1);
    }

}
