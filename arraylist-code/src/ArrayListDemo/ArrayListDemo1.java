package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //ArrayList<String> list = new ArrayList<String>();

        /*增*/
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("fff");
        list.add("ggg");
        list.add("hhh");

        /*删  remove(E)  E remove(index)*/
        list.remove("ddd");
        String remove = list.remove(2);
        System.out.println(remove);

        /*改  E set(index,E)*/
        String result = list.set(3, "zzz");
        System.out.println(result);

        /*查 E get()*/
        String s = list.get(2);
        System.out.println(s);
        /*长度  int size()*/

        System.out.println(list);
    }
}
