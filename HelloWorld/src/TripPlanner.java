import java.sql.Time;
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name + ", where are you traveling?");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds like a great trip");
        TimeBudget(input);
        System.out.println(" ");
        TimeDifference(input);
        System.out.println(" ");
        Area(input);
    }
    public static void TimeBudget(Scanner input) {
        System.out.println("How many days are you going to spend traveling? ");
        int days = input.nextInt();
        System.out.println("How much money, in USD, are you going to spend while there? ");
        double money = input.nextDouble();
        System.out.println("What is the three letter currency symbol for your travel destination? " );
        input.nextLine();
        String currency = input.nextLine();
        System.out.println("What is the exchange rate to USD in the country you're visiting? (in decimal)");
        double ExRate = input.nextDouble();
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("If you are traveling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
        double USDaDay = money / days;
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + USDaDay + " USD");
        double ExRateTotal = money / ExRate;
        double ExRatePerDay = ExRateTotal/days;
        System.out.println("Your total budget in " + currency + " is " + ExRateTotal + " " + currency + ", which per day is " + ExRatePerDay + " " + currency);
    }
    public static void TimeDifference(Scanner input) {
        System.out.println("What is the time difference, in hours, between your home and your destination? ");
        int TimeChange = input.nextInt();
        int midnight = TimeChange % 24;
        int noon = (TimeChange + 12) % 24;
        System.out.print("That means that when its midnight at home it will be " + midnight + ":00 in your travel destination"
        );
        System.out.println("and when its noon at your home it will be " + noon + ":00");
    }
    public static void Area(Scanner input) {
        System.out.println("What is the area of your travel destination country in km^2? ");
        int area = input.nextInt();
        double miles = area * 0.386;
        System.out.println("In miles that is " + miles );
    }
}
