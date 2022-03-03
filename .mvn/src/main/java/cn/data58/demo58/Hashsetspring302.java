package cn.data58.demo58;

/* 20210724,814,in Firefox, http://localhost:8080/hellohash
running ok, but not to Firefox, only to console
*/
/* 20210804, 在Eclipse上只点击run, 则http://localhost:8080/hellohash
 * Whitelabel Error Page
	This application has no explicit mapping for /error, so you are seeing this as a fallback.
	Wed Aug 04 11:44:24 CST 2021
	而需要：run as "springboot app " 才可以出console的提示
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

@RestController
public class Hashsetspring302 {

    //    public static void main(String[] args)
    @GetMapping("/hellohash")
    public void hashsetdemo1() {
        Collection<Student302> c = new HashSet<>();
        c.add(new Student302(1001, "张三302"));
        c.add(new Student302(1002, "李四"));
        c.add(new Student302(1003, "王五")); //10行
        c.add(new Student302(1003, "王五"));
        c.add(new Student302(1003, "王五"));
        c.add(new Student302(1003, "王五"));
        c.add(new Student302(1003, "王五")); //14行

        Iterator<Student302> i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

