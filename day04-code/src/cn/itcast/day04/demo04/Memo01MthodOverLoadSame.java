package cn.itcast.day04.demo04;

public class Memo01MthodOverLoadSame {

    public static void main(String[] args) {

        isSame(1L,1L);
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte参数的方法执行");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;

    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short参数的方法执行");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int参数的方法执行");
        boolean same;
        return same = a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long参数的方法执行");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;

    }

}
