package Function_Methods;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // this will print 90
        int x; // the class variable at line 4 is shadowed by this
       // System.out.println(x); // scope will begin when variable is initialized
        x = 30;
        System.out.println(x); // this will print 30
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
