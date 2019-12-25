//Write a program to print sum of digits from 1 to N using a for loop where N is a positive non-zero integer.
import java.util.Scanner;
public class Loopy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive non-zero integer");
        int num = sc.nextInt();
        int sum = 0;
        while (num < 1) {
            System.out.println("Please enter a positive non-zero integer");
            num = sc.nextInt();
        }                   // 3
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        } System.out.println("The sum of the digits from 1 to " + num + " is " + sum);
    }
}
