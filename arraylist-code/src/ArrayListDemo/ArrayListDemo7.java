package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        //定义一方法返回低于3000元的手机信息

        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("iPhone", 9999);
        Phone p2 = new Phone("小米", 1999);
        Phone p3 = new Phone("魅族", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        //获取价格小于3000元手机的信息并遍历
        ArrayList<Phone> resultList = getPhoneInfo(list);
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i).getBrand() + ", " + resultList.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price < 3000) {
//                如果当前手机价格小于3000，则增加到resultList集合中
                resultList.add(p);
            }
        }
        return resultList;
    }
}
