package Function_Methods;

import java.util.Scanner;

public class Function{
    // Main method to run the program
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.next();
        String personalised = myGree(name);
        System.out.println(personalised);
    }

    // Function to create a personalized greeting
    public static String myGree(String name) {
        return "Hello, " + name + "!";
    }
}