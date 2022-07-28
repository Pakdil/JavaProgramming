package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozok", 1239);

        System.out.println(account1);

        account1.deposit(1000);

        account1.checkBalance();

        account1.withdraw(900);

        account1.checkBalance();

        account1.deposit(900);

        account1.checkBalance();

        System.out.println("---------------");




    }


}
