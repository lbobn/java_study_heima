package test.rollcall;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RollCall5 {
    public static void main(String[] args) throws IOException {
        /*带权重的随机点名器*/

        //把文件中信息读入内存
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("z08-io-code\\src\\test\\rollcall\\names.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            String[] split = s.split("-");
            list.add(new Student(split[0], split[1], Integer.parseInt(split[2]), Double.parseDouble(split[3])));
        }
//        System.out.println(list);
        br.close();

        //计算权重总和
        double weight = 0;
        for (Student student : list) {
            weight += student.getWeight();
        }

        //计算每个人的权重占比
        double[] arr = new double[list.size()];
        int index = 0;
        for (Student v : list) {
            arr[index] = v.getWeight() / weight;
            index++;
        }
//        System.out.println(Arrays.toString(arr));

        //权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));

        //随机抽取
        double number = Math.random();
        System.out.println(number);
        //返回   -插入点-1
        //直接返回第几个
        int index2 = -Arrays.binarySearch(arr, number) - 1;
        System.out.println(index2);


        //获取随机到的学生
        Student student = list.get(index2);
        System.out.println(student);

        //权重减半
        student.setWeight(student.getWeight() / 2);

        BufferedWriter bw = new BufferedWriter(new FileWriter("z08-io-code\\src\\test\\rollcall\\names.txt"));
        for (Student student1 : list) {
            bw.write(student1.toString());
            bw.newLine();
        }
        bw.close();

    }
}

class Student {
    private String name;
    private String sex;
    private int gender;
    private double weight;

    public Student() {
    }

    public Student(String name, String sex, int gender, double weight) {
        this.name = name;
        this.sex = sex;
        this.gender = gender;
        this.weight = weight;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return name + "-" + sex + "-" + gender + "-" + weight;
    }
}
