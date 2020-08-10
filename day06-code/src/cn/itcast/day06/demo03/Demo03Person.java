package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person= new Person();
        person.show();
        System.out.println("++++++++++++++++++++++++++++++++++");
//        person.=26;
        person.setAge(26);
        person.name="bai";
        person.show();
    }


}
