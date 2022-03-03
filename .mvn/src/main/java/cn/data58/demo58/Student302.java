package cn.data58.demo58;

public class Student302 {

    private int num;
    private String name;

//    public Student()
//    {	}


    public Student302(int num, String name) {
        this.num = num;
        this.name = name;
    }


    public String toString() {
        return "学号: " + this.num + ",  姓名: " + name;
    }

    public boolean equals(Object o)//需要重写的方法
    {
        Student302 s = (Student302) o;

        return this.num == s.num && this.name.equals(s.name);
    }

    public int hashCode()//需要重写的方法
    {
        return num * this.name.hashCode();
    }
}
