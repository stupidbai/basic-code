package cn.itcast.day06.demo2;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.cole);
        System.out.println(two.price );
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.cole = "红";
        one.price = 4999;
        one.brand = "苹果";
        return one;
    }
}
