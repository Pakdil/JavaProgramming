package day24_CustomMethod_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";

        String result = reverse(str);
        System.out.println(result);

        int a, b;

        int result1 = sum(a=567,  b=346);
        System.out.println(result1);

    }

    public static String reverse(String str) { // "Java"

        String reverse = "";
        for (int i = str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static int sum(int a, int b) {

        int sum = a + b;

        return sum;
    }

}
