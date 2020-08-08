package cn.itcast.day05.demo.demo04;

public class  Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,45,6,4,5,61,646,16,55,4};
        printArray(array);

//        for (int k = 0; k < array.length; k++) {
//            System.out.println(array[k]);
//        }
    }

    public  static void printArray(int[] array){
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }

}
