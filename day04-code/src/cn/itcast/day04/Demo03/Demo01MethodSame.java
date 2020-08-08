package cn.itcast.day04.Demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(12,12));
        System.out.println(isSame(12,32));
    }

    public static boolean isSame(int a, int b){
        boolean same;
//        if(a==b) {
//            same = true;
//        }else{
//            same=false;
//        }




//        same = a==b ? true:false;


    same= a==b;

        return same;
    }
}
