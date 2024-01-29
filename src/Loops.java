import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        /*
        Syntax of for loops:

        for (initialisation; condition; increment/decrement){
        //body
        }
        */

        // Q: Print number from 1 to 5

        for(int num=1; num <=5; num += 1){
            System.out.println(num);
        }
        // print number 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num + " ");
        }
        //while loops:
        /*
           syntax:
           while(condition){
               //body
           }
         */
        int num = 1;
        while (num <=5){
            System.out.println(num);
            num += 1;
        }
        //do while
        /*
        do {

        }while(condition);
        */
        int number = 1;
        do {
            System.out.println(n);
            number++;
        } while (number <= 5);
    }
}
