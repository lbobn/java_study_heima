package stringdemo;

public class StringDemo9_2 {
    public static void main(String[] args) {
        /*关键字屏蔽*/
        /*replace()用法*/
        String talk = "你玩的真好，以后不要再玩了，SB，CNM";

        String[] arr = {"CNM", "SB", "NMD", "TMD", "MLGB"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
