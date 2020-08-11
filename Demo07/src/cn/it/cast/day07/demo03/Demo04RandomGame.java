package cn.it.cast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1; //[1,100];

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入");
            int getNMum = sc.nextInt();

            if (getNMum > num) {
                System.out.println("太大了，请重试。");

            } else if (getNMum < num) {
                System.out.println("太小了，请重试。");
            } else {
                System.out.println("猜中了");
                break;
            }

        }
        System.out.println("游戏结束");
    }
}
