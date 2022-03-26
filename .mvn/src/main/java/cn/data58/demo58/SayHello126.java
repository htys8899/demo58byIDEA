package cn.data58.demo58;


import org.hibernate.metamodel.internal.JpaStaticMetaModelPopulationSetting;

public class SayHello126 {
    //	@HelloWorld126(name = " in annotation add this name ")
    @HelloWorld126
    public void SayHello126(String name) {
        System.out.println(name + "+ after the @HelloWorld126 say hello world!126");
    }//www.heatpress123.net

    public static void main(String[] args) {
        SayHello126 test317=new SayHello126();
        test317.SayHello126("20220317");
    }
}