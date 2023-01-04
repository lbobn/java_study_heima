package com.it.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();


        loop:
        while (true) {
            System.out.println("———————————————————欢迎使用学生管理系统——————————————————");
            System.out.println("1.增加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent();
                case "3" -> updateStudent();
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                    //System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有这个选项！");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        //使用空参构造创建对象
        Student stu = new Student();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的id");
            String id = sc.next();
            //id唯一性判断
            boolean flag = contains(list, id);
            if (flag) {
                //id已存在，需重新录入
                System.out.println("id已存在，请重新输入");
            } else {
                //id不存在,添加id
                stu.setId(id);
                break;
            }
        }


        System.out.println("请输入学生的姓名");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生地址");
        String address = sc.next();
        stu.setAddress(address);

        //直接传参创建对象
//      Student stu=new Student(id,name,age,address);
        list.add(stu);

        System.out.println("学生信息添加成功！");
    }

    //删除学生
    public static void deleteStudent() {
        System.out.println("删除学生");
    }

    //修改学生
    public static void updateStudent() {
        System.out.println("修改学生");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        //打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        //当代码执行到这里，表示集合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getAddress());
        }
    }

    //判断id是否存在
    public static boolean contains(ArrayList<Student> list, String id) {

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return true;//遍历中若有id相同，则返回true
            }
        }

        return false;//遍历结束后还没相同id，则返回false

    }
}
