//Write a program to find the factorial of a number using while loop
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner fact = new Scanner(System.in);
        System.out.println("please type a number to get the factorial ");
        int num = fact.nextInt(); // num is 5
        int counter = 0;
        int total = 1;
        while (counter < num ) { // num is 5
            counter++;
           total = counter * total; //1, 2, 6, 24, 120

        }

        System.out.println(total);

    }
}
