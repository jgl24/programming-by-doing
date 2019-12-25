import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
        System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
        System.out.println("3) Quit");
        System.out.println();
        System.out.print(">");
        int choice = keyboard.nextInt();
        do {
            if(choice == 1){
                firstTrick();
            }
            if(choice == 2) {
                secondTrick();
            }
            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
            System.out.println("3) Quit");
            System.out.println();
            System.out.print(">");
            choice = keyboard.nextInt();

        } while (choice < 3);

    }

    public static void firstTrick() {
        for (int x = 1; x <= 9; x++) {
            for (int y = 0; y <= 9; y++) {
                int sum = x + y;
                String concatNum = x + "" + y;
                int num = Integer.parseInt(concatNum); // takes in a string and converts it back to int
                if (sum > 10 && num <= 56)
                    System.out.println(num);
            }
        }
    }

    public static void secondTrick() {
        for (int x = 1; x <= 9; x++) {
            for (int y = 0; y <= 9; y++) {
                int sum = x + y;
                String concatfirstNum = x + "" + y;
                int firstNum = Integer.parseInt(concatfirstNum);
                String concatSecondNum = y + "" + x;
                int secondNum = Integer.parseInt(concatSecondNum);
                if (firstNum - secondNum == sum) {
                    System.out.println(firstNum + " & " + secondNum);
                }
            }
        }
    }
}

