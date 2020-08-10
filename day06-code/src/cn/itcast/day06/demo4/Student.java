package cn.itcast.day06.demo4;

public class Student {
    private int age;
    private String name;

    public Student() {
        System.out.println("构造方法01");
    }

//    public Student(String name,int age){
//        System.out.println("全参构造方法");
//        this.age=age;
//        this.name=name;
//    }


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
