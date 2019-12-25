import java.util.Scanner;

public class Grades {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your exam score: ");
        int grade = input.nextInt();
        System.out.println("Here is your grade: ");
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80 && grade < 90){
            System.out.println("B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
