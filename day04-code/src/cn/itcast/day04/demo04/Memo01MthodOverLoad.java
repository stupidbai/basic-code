package cn.itcast.day04.demo04;

public class Memo01MthodOverLoad {

    public static void main(String[] args) {
        System.out.println(sum(12,1));
        System.out.println(sum(12,1,34));
        System.out.println(sum(12,1,3 ,45));
    }

    public static int  sum(int a,int b) {
        return a + b;
    }


    public static int  sum(int a,int b,int c) {
        return a + b + c;
    }

    public static int  sum(int a,int b,int c ,int d) {
        return a + b + c +d;
    }
}
