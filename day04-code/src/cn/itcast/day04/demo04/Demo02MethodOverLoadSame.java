package cn.itcast.day04.demo04;

public class Demo02MethodOverLoadSame {
    public static void main(String[] args) {

    }

    public static boolean isSame(byte a,byte b){
        boolean same;
        same = a==b ? true : false;
        return same;
    }

    public static boolean isSame(short a,short b){
        boolean same;
        same = a==b ;
        return same;
    }
    public static boolean isSame(int a,int b){
        boolean same;
        same = a==b ? true : false;
        return same;
    }
    public static boolean isSame(Long a,Long b){
        boolean same;
        same = a==b ? true : false;
        return same;
    }

}
