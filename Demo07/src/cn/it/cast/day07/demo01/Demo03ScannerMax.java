package cn.it.cast.day07.demo01;



import java.util.Scanner;

public class Demo03ScannerMax {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第1个数字：");
        int a =sc.nextInt();
        System.out.println("请输入第2个数字：");
        int b =sc.nextInt();
        System.out.println("请输入第3个数字：");
        int c =sc.nextInt();

        int temp = a>b? a:b;
        int max = temp>c?temp:c;
        System.out.println("最大值是："+ max);



    }



//    public static int getMax(int array[]){
//        int max =0;
//        for (int i = 0; i <array.length ; i++) {
//            max = max>array[i] ? max:array[i];
//        }
//
//
//        return max;
//    }
}
