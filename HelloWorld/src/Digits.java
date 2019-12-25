import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
// Write a program to print how many digit’s the number is of as 2, 3- or 4-digit number.

public class Digits {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a number any number");
        int num = sc.nextInt();
        String count = Integer.toString(num);
        if (count.length() == 4) {
            System.out.println("4-digit Number");
        }   else if (count.length() == 3) {
            System.out.println("3-digit Number");
        } else if (count.length() == 2) {
            System.out.println("2-digit Number");
        }
    }
}
