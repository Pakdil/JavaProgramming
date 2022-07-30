package day32_Constructors;

public class Employee {

    public String name;
    private char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name) {

        this.name = name;
    }

    public Employee(String name, char gender) {
      //  this(name);
        this.name = name;
        this.gender = gender;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= " + salary +
                '}';
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name, gender);
        //this.name = name;
        //this.gender = gender;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {

        this(name, gender, jobTitle);
        this.salary = salary;

    }

    public void method1() {


    }







}
