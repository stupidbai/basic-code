package cn.it.cast.day07.demo4;

public class Demo04Array {
    public static void main(String[] args) {
        Person[] arrray = new Person[3];

        Person one =new Person("迪丽热巴1",18);
        Person two =new Person("迪丽热巴2",28);
        Person three =new Person("迪丽热巴3",38);

        arrray[0]=one;
        arrray[1]=two;
        arrray[2]=three;

        System.out.println(arrray[0]);
        System.out.println(arrray[1]);
        System.out.println(arrray[2]);

        Person person=arrray[1];
        System.out.println(person.getName());
    }
}
