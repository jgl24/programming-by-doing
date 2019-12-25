import java.util.Scanner;

public class NewConcept {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your last name?");
        String LastName = keyboard.nextLine();
        String nameOne = "Careswell";
        String nameTwo = "Jones";
        String nameThree = "Smith";
        String nameFour = "Young";
        if (LastName.compareTo(nameOne) <= 0) {
            System.out.println("\"you don't have to wait long\"");
        } else if (LastName.compareTo(nameTwo) <= 0) {
            System.out.println("\"that's not bad\"");
        } else if (LastName.compareTo(nameThree) <= 0) {
            System.out.println("\"looks like a bit of a wait\"");
        } else if (LastName.compareTo(nameFour) <= 0) {
            System.out.println("\"not going anywhere for a while\"");
        }
    }
}