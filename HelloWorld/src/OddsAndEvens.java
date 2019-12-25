import java.util.*;

public class OddsAndEvens {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets play a game called \"Odds and Evens\"");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", please type \"O\" to pick odds or \"E\" to pick evens");
        String choice = scanner.nextLine();
        String odds = "O";
        String evens = "E";
        if (choice.equals(odds)) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (choice.equals(evens)) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("-------------------------------------------------");
        System.out.println("How many \"finger\" do you put out?");
        int userNumber = scanner.nextInt();
        Random rand = new Random();
        int computerNumber = rand.nextInt(6);
        System.out.println("The computer plays number " + computerNumber);
        System.out.println("-------------------------------------------------");
        int sum = userNumber + computerNumber;
        System.out.println(userNumber + " + " + computerNumber + " = " + sum);
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven == true) {
            System.out.println(sum + " is ...even!");
            if (choice.equals(evens)) {
             System.out.println(name + " wins!");
        } else {
             System.out.println("The computer wins :(");
            }

        } else {
                System.out.println(sum + " is...odd!");
                if(choice.equals(odds)) {
                    System.out.println(name + " wins!");
                } else {
                    System.out.println("The computer wins :(");
                }
            }

        }
    }
