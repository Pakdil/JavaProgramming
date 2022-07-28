package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // 0
        numbers.add(20); //1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(50);//4
        numbers.add(60); //5

        System.out.println(numbers);

        numbers.add(6,30);
        numbers.add(2,25);
        System.out.println("numbers = " + numbers);

        System.out.println(numbers.size());
        
        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("--------------------");

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));
        }
            System.out.println("----------------------");

            ArrayList<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("C#");
            list.add("Ruby");


            list.set(2,"JavaScript"); // replace
            list.set(3,"C++");

            System.out.println(list);


        System.out.println("--------------");

        ArrayList<String> emplyoyees = new ArrayList<>();

        emplyoyees.add("Suat");
        emplyoyees.add("Aygun");
        emplyoyees.add("Olga");
        emplyoyees.add("Neira");
        emplyoyees.add("Ali");
        emplyoyees.add("Hulya");
        emplyoyees.add("Kaloyan");

        System.out.println(emplyoyees);

        emplyoyees.remove(0);

        System.out.println(emplyoyees);

        emplyoyees.remove(0);

        System.out.println(emplyoyees);

        emplyoyees.remove(0);

        System.out.println(emplyoyees);

        emplyoyees.remove(emplyoyees.size()-1);
        System.out.println(emplyoyees);


        emplyoyees.remove("Hulya");

        System.out.println(emplyoyees);



    }
}
