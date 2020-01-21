import java.util.Random;
import java.util.Scanner;

public class FIndingValueArray {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        int arrayOne[] = new int[10];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = 1 + rand.nextInt(50); // assigns random value to each element in array
        }
        System.out.print("Array: ");
        for (int i = 0; i < arrayOne.length; i++) { // prints each value in each element
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();
        System.out.print("Value to find: ");
        int findNum = keyboard.nextInt(); // ask user for their input
        boolean found = false;
        int counter = 0;


        for (int i = 0; i < arrayOne.length; i++) {// loops through as sees if any of the elements match the users input
            if (arrayOne[i] == findNum) {
                System.out.println(findNum + " is in the array. ");
                found = true;
                System.out.println(findNum + " was found in slot " + counter);
            } counter++;
        }
        if(found == false){
            System.out.println(findNum + " is not in the array. ");
        }

    }
}
