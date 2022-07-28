package day24_CustomMethod_Return;

import java.util.Locale;

public class BreakfastTasks {


    public static void main(String[] args) {

        initials("Wooden", "Spoon"); //
        initials("Cydeo", "School");

        System.out.println("---------------");

        domain("Cydeo@gmail.com");

        System.out.println("---------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        domain(emails[1]);

        System.out.println("---------------");

        for (String email: emails) {
            domain(email);


        }

        System.out.println("---------------");

        nameOfMonth(7);


        }




    // 1. Create a method that can display the initials of the person. initials(String firstName, String lastName)

    public static void initials(String firstName, String lastName) {

        // System.out.println("Hello World!"); // Hello World!

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    // 2. Create a method that can display the domain of the email. domain(String email)

    public static void domain(String email) { // Cydeo@gmail.com

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);


    }

    // 3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number) {
        String name = "";

        if (number>=1 && number<=12) {
            name = (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May"
                    : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "Augest" : (number == 9) ? "September" : (number == 10) ? "October"
                    : (number == 11) ? "November" : "December";
        } else {
            name ="Invalid";
        }

        System.out.println("Month name =" +name);



    }



}
