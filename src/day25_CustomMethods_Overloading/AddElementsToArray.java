package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

       arr = addInteger(arr, 5);

        System.out.println(Arrays.toString(arr));


        System.out.println("----------------------");

    double [] arr2 = {1.5, 2.4, 3.7, 8.0, 0.23};
    arr2 = addDouble(arr2, 9.7);

        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------");

        char [] arr3 = {'a', 'h', 'm', 'e'};
        arr3 = addChar(arr3, 't');

        System.out.println(Arrays.toString(arr3));



    }

/*
        1. Create a return method called addInteger that can add an Tnteger after the last index of an integer array

        {1,2,3,4}, 5
        new array >> {1,2,3,4,5}
 */



    public static int[] addInteger(int[] array, int element) {


        int [] result = new int[array.length+1];

        int i = 0;
        for (int each: array) {

            result[i++] = each;


        }

        result[i] = element;

        return result;
    }





    // 2. addDouble

     public static double[] addDouble(double[] array, double element) {

         double[] result = new double[array.length + 1];

         int i = 0;

         for (double each: array) {

             result[i++] = each;

         }

         result[i] = element;

         return result;

     }

     // 3. char

    public static char [] addChar(char [] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;

        for (char each : array) {

            result[i++] = each;

        }

        result[i] = element;

        return result;
    }
}



