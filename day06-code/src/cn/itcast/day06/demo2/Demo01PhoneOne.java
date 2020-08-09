package cn.itcast.day06.demo2;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.cole);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


        one.brand="苹果";
        one.cole="红色";
        one.price=8888;
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.cole);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


        one.call("白云飞");
        one.sentMessge();
    }
}
