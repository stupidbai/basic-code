package cn.itcast.day06.demo2;

public class Phone {

    String brand;
    double price;
    String cole;

    public void  call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void  sentMessge(){
        System.out.println("群发短信");
    }
}
