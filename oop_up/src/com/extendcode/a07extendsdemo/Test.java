package com.extendcode.a07extendsdemo;

public class Test {
    public static void main(String[] args) {
        /*1.经理
            成员变量:工号，姓名，工资，管理奖金
            成员方法:工作(管理其他人)，吃饭(吃米饭)
          2.厨师
            成员变量:工号，姓名，工资
            成员方法:工作(炒菜)，吃饭(吃米饭)
*/

        //创建对象并赋值调用
        Manager m = new Manager("001", "zhangsan", 15000, 8000);
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("002");
        c.setName("lisi");
        c.setSalary(8000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}
