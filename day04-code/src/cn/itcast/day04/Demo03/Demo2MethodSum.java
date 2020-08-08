package cn.itcast.day04.Demo03;

public class Demo2MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是"+ getSum());
    }

    public static int  getSum(){
        int sum=0;
        for (int i=1; i < 100;i++){
         sum += i;
        }
        return sum;
    }

    public static class Demo04MethodNotice {

        public static void main(String[] args) {

        }

        public static int method1(){
            return  10;
        }

        public static void methon2(){
            return ;
        }

        public static void methon3(){
            System.out.println("AAA");
            System.out.println("bbb");
            return;
        }
    }
}
