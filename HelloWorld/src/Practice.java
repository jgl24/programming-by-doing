import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three integers:");
        System.out.print("Side 1: ");
        int sideOne = keyboard.nextInt();
        System.out.print("Side 2: ");
        int sideTwo = keyboard.nextInt();

        while (sideTwo < sideOne) {
            System.out.println(sideTwo + " is smaller than " + sideOne + ". Try again.");
            System.out.print("Side 2: ");
            sideTwo = keyboard.nextInt();
        }
        System.out.print("Side 3: ");
        int sideThree = keyboard.nextInt();
        while (sideThree < sideTwo) {
            System.out.println(sideThree + " is smaller than " + sideTwo + ". Try again.");
            System.out.print("Side 3: ");
            sideThree = keyboard.nextInt();
        }
        System.out.println("Your three sides are " + sideOne + " " + sideTwo + " " + sideThree);
        if (sideTwo <= sideOne || sideThree <= sideTwo) {
            System.out.println("NO!  These sides do not make a right triangle!");
        }
         if(sideOne < sideTwo && sideTwo < sideThree) {
             System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
         }

    }
}