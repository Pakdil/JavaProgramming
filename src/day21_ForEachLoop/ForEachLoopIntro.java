package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < numbers.length; i++) {

            int eachElement = numbers[i];

            System.out.println(eachElement);


        }

        System.out.println("-------------");

        for (int each : numbers) {
            System.out.println(each);

        }

        int[] numbers2 = {3, 6, 9};
        for (int each1 : numbers2) {
            System.out.println(each1);

        }
    }

}

    /*

     */

