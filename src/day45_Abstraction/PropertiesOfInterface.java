package day45_Abstraction;


public interface PropertiesOfInterface {


    int a = 100;  // final
    static int b = 200; //final, static keyword is optional

    /*
    public PropertiesOfInterface(int a) {
        this.a = a;
    }

     */

    /*

    static {
        b=100;
    }

     */

    /*

    public void method1() {
        System.out.println("Instance method");
    }

     */


    public static void method2() {

        System.out.println("Static Method");
    }

    public abstract void Method3();
}
