package practice;

import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {

        Consumer<int[]> printEach = n -> {
            for (int each : n) {
                System.out.println(each);

            }

        };

        int[] numbers = {100, 200, 300, 4000};
        printEach.accept(numbers);
    }
}
