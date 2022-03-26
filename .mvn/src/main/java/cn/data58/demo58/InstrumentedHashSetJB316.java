package cn.data58.demo58;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

// 20220316,Joshua Bloch和Neal Gafter,from http://www.myexceptions.net/j2se/4889.html
@SpringBootApplication
public class InstrumentedHashSetJB316<E> extends HashSet<E> {
    private int addCount = 0;
    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
        return super.addAll(c);
    }

    public static void main(String[] args) {
//        SpringApplication.run(InstrumentedHashSetJB316.class,args);
        SpringApplication myspring66 =new SpringApplication(InstrumentedHashSetJB316.class);
        myspring66.run(args);
        InstrumentedHashSetJB316<String> s = new InstrumentedHashSetJB316<String>();
        s.addAll(Arrays.asList("Accordion","Banjo","Kazoo","wuhangteam"));
        System.out.println("20220316JB-2:"+s.addCount);
    }
}
