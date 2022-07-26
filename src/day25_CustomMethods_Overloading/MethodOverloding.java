package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloding {


    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray
        ));

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println(Arrays.toString(charArray));


        System.out.println("---------------------");

       int sum = sumOfNumbers(10, 20, 30, 40);
        System.out.println("sum = " + sum);

        double sumDouble = sumOfNumbers(10,20, 30, 40, 50);
        System.out.println("sumDouble = " + sumDouble);

        double sum1 = sumOfNumbers(3.345, 2.784545, 4.567);

        System.out.println("sum1 = " + sum1);

        double sum3 = sumOfNumbers(3,5);
        System.out.println("sum3 = " + sum3);




    }

    public static double sumOfNumbers(int num1, int num2) {return num1 + num2;}
    public static int sumOfNumbers(int num1, int num2, int num3) {return num1 + num2 + num3;}
    public static double sumOfNumbers(double num1, double num2, double num3) {return num1 + num2 + num3;}

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {return num1 + num2 + num3 + num4;}



    public static double sumOfNumbers(int num1, int num2, int num3, int num4, int num5) {return num1 + num2 + num3 + num4 + num5;}


}
