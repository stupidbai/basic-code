package cn.itcast.day04.demo01;

public class Demo04MethodReturn {
    public static void main(String[] args) {
       int num =method1(2,3);
        System.out.println("返回值是" +"a+"+"b=" +num);
    }
    public static int method1(int a, int b ) {
        int result = a * b;
        return result;
    }
}
