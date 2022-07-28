package day17_While_DoWhile;

public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 0;

        do {

            System.out.println("Hello");
        } while (i > 5);  // even if the condition is false, excute

        System.out.println("------------");

        while (i>5) { // condition is false
            System.out.println("Hello");
        }
        System.out.println("------------");

        do {
            System.out.println("Hello");
            i++;
        } while (i<5);
    }



}
