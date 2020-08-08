package cn.itcast.day05.demo.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
            int[] result=caiculate(10,20,30);
        System.out.println("总和=" + result[0]);
        System.out.println("平均值=" + result[1]);
    }

    public static int[] caiculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg}; //正确
//        array[0]=sum;
//        array[1]=avg;
//        return array;

        return array;

    }
}
