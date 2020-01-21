import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args){
        String[] lastName = {" Lopez ", " Anderson ", " Cooper ", " Gaga ", " Styles "};
        double[] grades = {100.00, 99.99, 43.25, 78.90, 85.45};
        int[] studentID = {34700, 43020, 50340, 30450, 50040};

        System.out.println("Values:\t");

        for(int i = 0; i < lastName.length; i++){
            System.out.print(lastName[i]+ grades[i] + " " + studentID[i]);
            System.out.println();
            }
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("ID number to find: ");
        int IDnum = keyboard.nextInt();
        System.out.println();
        int counter = 0;
        int element = 0;

        for(int i = 0; i < studentID.length; i++){
            if(IDnum == studentID[i]){
                System.out.println("Found in slot " + counter);
                element = counter;
                System.out.println("Name: " + lastName[element]);
                System.out.println("Average: " + grades[element]);
                System.out.println("ID: "+ studentID[element]);
            }  counter++;

        }

        }
    }
