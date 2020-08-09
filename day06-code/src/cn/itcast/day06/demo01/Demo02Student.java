package cn.itcast.day06.demo01;

public class Demo02Student {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        student.name="baiyunfei";
        student.age=26;
        System.out.println(student.name);
        System.out.println(student.age);
    }

}
