package Function_Methods;

public class Overloading {
    public static void main(String[] args) {
        fun(772);
        fun("Saifullah");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String Name){
        System.out.println(Name);
    }
}
