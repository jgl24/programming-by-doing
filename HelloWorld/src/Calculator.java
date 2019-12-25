import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a, b, c;
        String operator;

        do {
            System.out.print("> ");
            a = keyboard.nextDouble();
            operator = keyboard.next();
            b = keyboard.nextDouble();
            if (a!= 0) {
                if (operator.equals("+")) {
                    c = a + b;
                } else if (operator.equals("-")) {
                    c = a - b;
                } else if (operator.equals("*")) {
                    c = a * b;
                } else if (operator.equals("/")) {
                    c = a / b;
                } else if (operator.equals("^")){
                    c = Math.pow(a,b);
                } else if (operator.equals("%")){
                    c = a % b;
                }
                else {
                    System.out.println("Undefined operator: '" + operator + "'.");
                    c = 0;
                }
                System.out.println(c);
            } else {
                System.out.println("Bye, now.");
                break;
            }

            }
            while (true);
        }
    }

