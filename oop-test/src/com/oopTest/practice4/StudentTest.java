package com.oopTest.practice4;

public class StudentTest {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性:学号，姓名，年龄。
        要求1∶再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2:添加完毕之后，遍历所有学生信息。
        要求3∶通过id删除学生信息 如果存在，则删除，如果不存在，则提示删除失败。
        要求4∶删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为“3”的学生，如果存在，则将他的年龄+1岁*/

        //定义数组
        Student arr[] = new Student[3];

        //创建学生对象 作为数组初始数据
        Student s1 = new Student(1, "张三", 19);
        Student s2 = new Student(2, "李四", 20);
        Student s3 = new Student(3, "王五", 21);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //要求1
        //创建学生对象
        Student s4 = new Student(5, "赵六", 22);

        //先进行学号唯一性判断
        int result = findId(arr, s4.getId());
        //查找返回为>=0则已有，否则为无
        if (result >= 0) {
            System.out.println("学号已存在，请修改学号后添加");
        } else {
            int count = getCount(arr);//获取原数组元素个数
            if (count == arr.length) {
                //数组已满，则创建一个新数组(长度为旧数组长度+1）并存入
                Student[] newArr = creatNewArr(arr);
                newArr[count] = s4;
                //要求2:添加完毕之后，遍历所有学生信息。

                printArr(newArr);

            } else {
                //数组未满，则直接存入
                arr[count] = s4;
                //要求2:添加完毕之后，遍历所有学生信息。
                printArr(arr);
            }
        }


        //要求3.通过id删除学生信息 如果存在，则删除，如果不存在，则提示删除失败。
        System.out.println();
        delete(arr, 2);
        //要求4.删除完遍历
        printArr(arr);

        //要求4.查询数组id为“3”的学生，如果存在，则将他的年龄+1岁
        System.out.println();
        int res = findId(arr, 3);
        if (res >= 0) {
            arr[res].setAge(arr[res].getAge() + 1);
        } else {
            System.out.println("要查找的id不存在，修改失败");
        }
        printArr(arr);


    }

    //定义方法通过id删除信息
    public static void delete(Student[] arr, int id) {
        int result = findId(arr, id);
        if (result >= 0) {
            arr[result] = null;
            //返回>=0，则删除
            for (int i = result; i < arr.length; i++) {
                if (i != arr.length - 1) {
                    arr[i] = arr[i + 1];
                } else {
                    arr[i] = null;
                }
            }
        } else {
            //返回-1，则未找到id
            System.out.println("学号(id)不存在，删除失败！");
        }
    }

    //定义方法遍历数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
            }
        }
    }

    //定义方法创建新数组,并将原数组数据拷贝到新数组
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;

    }

    //定义方法查找是否有指定id
    public static int findId(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }


    //定义方法判断数组中元素个数
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }
}
