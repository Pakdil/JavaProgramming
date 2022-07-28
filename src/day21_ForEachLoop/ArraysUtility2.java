package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Cunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String[] earlyBirds = Arrays.copyOf(students, 3);

        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(earlyBirds));

        String[] earlyBirds1 = Arrays.copyOf(students, 30);
        System.out.println(Arrays.toString(earlyBirds1));

        System.out.println("-------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2, 6);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        int [] scores = {10,20,30,40,50,60,70,80,90,100};

        int [] result = Arrays.copyOfRange(scores,3,7);
        System.out.println(Arrays.toString(result));

        int [] result2 = Arrays.copyOfRange(scores, 3, scores.length);
        System.out.println(Arrays.toString(result2));
        

        }
    }


/*
copyOf(array, newLength): copys the elements of the
array, starting from first element to given number, returns new array
copyOfRange(array, beginningIndex, endingIndex): copys
the elements of the array, staring from beginning index till the ending
index (ending index excluded), returns new array
 */