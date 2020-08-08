package cn.itcast.day04.demo01;

public class Demo03 {
    public static void main(String[] args) {
        method(3,4);
        method1(3,6);

    }

    //
    public static int method1(int a, int b ){
        int result=a*b;
        return result;
    }


    public static void method(int a, int b ){
        int result=a*b;
        System.out.println(result);
    }
}
