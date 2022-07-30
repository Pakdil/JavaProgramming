package day32_Constructors;

public class EmplyoyeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ahmet");

        Employee employee2 = new Employee("Yuliya", 'F');

        Employee employee3 = new Employee("Yasin", 'M', "SDET");

        Employee employee4 = new Employee("Mehmet", 'M', "QA", 130000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }


}
