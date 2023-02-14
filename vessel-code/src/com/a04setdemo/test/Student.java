package com.a04setdemo.test;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double chinese;
    private double math;
    private double english;

    public Student() {
    }

    public Student(String name, int age, double chinese, double math, double english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public double getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return math
     */
    public double getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(double math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return english
     */
    public double getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(double english) {
        this.english = english;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + ", sum = " + getSum() + "}";
    }

    private double getSum() {
        return this.getChinese() + this.getMath() + this.getEnglish();
    }

    @Override
    public int compareTo(Student o) {
        double sum1 = this.getChinese() + this.getMath() + this.getEnglish();
        double sum2 = o.getChinese() + o.getMath() + o.getEnglish();

        double i = sum1 - sum2;
        /*如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英文成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排*/
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        i = i == 0 ? this.getMath() - o.getMath() : i;
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;

        return (int) i;
    }
}
