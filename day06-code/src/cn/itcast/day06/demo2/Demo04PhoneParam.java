package cn.itcast.day06.demo2;

public class Demo04PhoneParam {

    public static void main(String[] args) {

        Phone one =new Phone();
        one.brand="苹果";
        one.cole="红色";
        one.price=5999;

        method(one);
    }

    public static void method(Phone param) {
        System.out.println(param.price);
        System.out.println(param.cole);
        System.out.println(param.brand);
    }
}
