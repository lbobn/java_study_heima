package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);

        //增加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
}
