package cn.data58.demo58;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

// 如果没有下面注释，则报错：org.springframework.context.ApplicationContextException: Unable to start web server

@SpringBootApplication
public class InterfaceTest303old1 implements Interface303 {

    public static void main(String[] args) {
        SpringApplication.run(InterfaceTest303old1.class, args);
        InterfaceTest303old1 test = new InterfaceTest303old1();
        test.facemethod1("the interface method 20220303");
        test.inoverride1("over11");
        System.out.println(test.generate(18) + "\n"); // 20220314, copy from eclispe
        // todo log file 20220305
        // add 20220315
        System.out.println("20220315:"+test.yesOrNo("true") + " " + test.yesOrNo("Yes"));
    }

    @Override
    public void inoverride1(String strover1) {
        // TODO Auto-generated method stub
        System.out.println("implement the method in interface1 " + strover1);
    }

    // 源自：20211001，https://blog.csdn.net/tester_nie/article/details/70195409
    // 20220313，从Eclispe截取代码，放方法于此class ;
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));
            allrows.add(new ArrayList<>(row));
        }
        return allrows;
    }

    // 20220315,从 http://www.myexceptions.net/j2se/4889.html，切方法，改static 为 public
    public  boolean yesOrNo(String s) {
        s = s.toLowerCase();
        if (s.equals("yes") || s.equals("y") || s.equals("t")) {
            s = "true";
        }
        return Boolean.getBoolean(s);
    }


}
