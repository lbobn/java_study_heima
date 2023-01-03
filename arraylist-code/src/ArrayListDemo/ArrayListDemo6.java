package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        /*
         * main()方法中定义一个集合，存入三个用户对象。
         * 属性为：id，username，password
         * 定义一个方法，根据id查找对应用户信息
         * 1.存在返回true
         * 不存在返回false*/

        /*2.存在返回索引
         * 不存在返回-1*/

        ArrayList<User> list = new ArrayList<>();


        //创建三个用户对象
        User u1 = new User("001", "zhangsan", "123456");
        User u2 = new User("002", "lisi", "12345678");
        User u3 = new User("003", "wangwu", "qwert001");

        //增加到集合
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //查找
        System.out.println(contains(list, "003"));
        System.out.println(getIndex(list, "003"));
        System.out.println(contains(list, "005"));
        System.out.println(getIndex(list, "005"));

    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            boolean result = list.get(i).getId().equals(id);
            if (result) {
                return i;//如果找到返回索引i
            }
        }

        return -1;//循环结束还没找到，返回-1
    }

    public static boolean contains(ArrayList<User> list, String id) {
        /*for (int i = 0; i < list.size(); i++) {
            boolean result = list.get(i).getId().equals(id);
            if(result){
                return true;//如果找到返回true
            }
        }

        return false;//循环结束还没找到，返回false*/


        return getIndex(list, id) >= 0;
    }
}
