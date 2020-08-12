package cn.it.cast.day07.demo4;

import java.util.ArrayList;

public class DemoArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list);

        boolean success=list.add("bai");
        System.out.println("添加的动作是否成功："+ success);

        list.add("yun");
        list.add("fei");
        System.out.println(list);

        String name=list.get(2);
        System.out.println("第二号人物"+name);

        String whoRemoved=list.remove(1);
        System.out.println("被删除的是"+ whoRemoved);
        System.out.println(list);

        int size =list.size();
        System.out.println("集合的长度是"+size);
    }
}
