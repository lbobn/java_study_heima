package stringbuilddemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        /*拼接字符串*/
        int[] arr = {1, 2, 3};
        String result = arrToString(arr);
        System.out.println(result);

    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
