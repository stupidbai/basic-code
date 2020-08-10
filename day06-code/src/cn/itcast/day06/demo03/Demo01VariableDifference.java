package cn.itcast.day06.demo03;

/*
1.局部变量和成员变量
局部变量：在方法内
成员变量：在方法外部，直接写在类当中



2.作用范围不一样
局部变量：只有方法当中才可以使用，出了方法不能使用
成员变量：整个类都可以使用


 3.默认值不一样
局部变量：没有默认值
成员变量：如果没有赋值，会有默认值
 /

 4.内存位置不一样
 4.生命周期不一样
 */
public class Demo01VariableDifference {
    String name;
    public void metnod(){
        int num =20;
        System.out.println(num);

    }
    public void metnodB(){

//        System.out.println(num);

    }

}
