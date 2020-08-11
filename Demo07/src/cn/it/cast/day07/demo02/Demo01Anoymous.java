package cn.it.cast.day07.demo02;

public class Demo01Anoymous {

    public static void main(String[] args) {
        Person person =new Person();
        person.name="bai";
        person.showName();


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        //匿名对象
        new Person().name="yun";
        new Person().showName()  ;

    }
}
