package com.method.demo;

public class test {
    public static void main(String[] args) {
        //定义方法，比较两个长方形面积

        //compare(10,20,30,40);
        double area1=getArea(10,20);
        double area2=getArea(20,40);
        compare(area1,area2);

    }

    public static double getArea(double len,double width){
        return len*width;
    }

    public static void compare(double area1,double area2){
        if(area1>area2){
            System.out.println("第一个长方体大");
        }else{
            System.out.println("第二个长方体大");
        }
    }

/*    public static void compare(double len1,double width1,double len2,double width2){
        double area1=len1*width1;
        double area2=len2*width2;
        if(area1>area2){
            System.out.println("第一个长方形大");
        }else{
            System.out.println("第二个长方体大");
        }
    }*/
}
