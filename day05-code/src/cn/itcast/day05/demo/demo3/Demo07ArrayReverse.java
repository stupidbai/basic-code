package cn.itcast.day05.demo.demo3;

public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 7, 2, 3, 4, 9};
//        int i = 0;
//        int j = array.length - 1;
//        int temp = 0;
//        for (; i < j; i++) {
//            if (i < j) {
//                temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//                j--;
////                System.out.println(array[i]);
//
//            }
//
//        }
//        for (int k = 0; k < array.length; k++) {
//            System.out.println(array[k]);
//
//        }


        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
}