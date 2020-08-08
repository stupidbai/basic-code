package cn.itcast.day04.Demo03;

public class DemeMethodPrint {

    public static void main(String[] args) {
        printCount(7);
    }

    public static void  printCount(int num){
        for (int i = 0; i <num ; i++) {
            System.out.println("HelloWord"+ i);
        }
    }

}
