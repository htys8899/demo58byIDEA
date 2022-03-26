package cn.data58.demo58;

public interface Interface303 {

    void  inoverride1(String str);

    default void facemethod1(String strf1) {
        //    TODO Auto-generated method stub
        System.out.println("logging interface1::" + strf1);

    }
    static boolean isNull318(String str) {//static 方法
//    public  boolean isNull(String str) {//static 方法
        System.out.println("Interface303 static method !!");

        return str == null ? true : "".equals(str) ? true : false;
    }

}
