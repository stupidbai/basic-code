package cn.it.cast.day07.demo01;

import java.util.Scanner;

public class Demo01Scanner {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();

        System.out.println("输入的string数字是"+ str);

        int num = sc.nextInt();
        System.out.println("输入的int数字是"+ num);


    }
}
