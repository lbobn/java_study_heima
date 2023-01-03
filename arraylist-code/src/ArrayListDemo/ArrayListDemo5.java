package ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        //键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();//此句不能放在循环外，因为list.add()传入的是地址
            System.out.println("请输入学生姓名：");
            s.setName(sc.next());
            System.out.println("请输入学生年龄：");
            s.setAge(sc.nextInt());
            list.add(s);
        }

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());

        }
//        System.out.println(list);
    }


}
