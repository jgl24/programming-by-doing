import java.util.Scanner;
public class Functions {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Valentino");
        System.out.println();
        System.out.println("1. Add purse to Order");
        System.out.println("2. Remove purse from Order");
        System.out.println("3. View Current Order");
        System.out.println("4. Checkout");
        System.out.println();
        int choice = 0;
        int price = 1000;
        int numOfPurses = 0;
        double salesTax = 0.0825;
        double shippingCost = 15.00;
        double additonalSC = 1.00;

        while (choice < 4) {

            System.out.print("Please enter your choice: ");
            choice = keyboard.nextInt();
            if (choice == 1) {
                int result = add_purse(numOfPurses);
                numOfPurses += result;


            } else if (choice == 2) {
                int result = remove_purse(numOfPurses);
                numOfPurses = result;
                // numOfPurses is storing # of purses, remove_purse is just the method used to subtract and return whats left over


            } else if (choice == 3) {
                vieworder(numOfPurses, price, salesTax, shippingCost, additonalSC);
            } else if (choice == 4) {
                int totalCost = numOfPurses * price;
                checkout(numOfPurses, price, salesTax, shippingCost, additonalSC);
            }
              else {

            System.out.println("ERROR 015b! Please select a valid menu item: ");
            System.out.println();
            System.out.println("1. Add purse to Order");
            System.out.println("2. Remove purse from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            System.out.println();
            System.out.print("Please enter your choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();





            //***** ask Kyle why this is asking for input twice and only recognizes the 2nd integer inputted *****
                // also how to make sure the number of purses is always equal or greater than 0




        }
        }


    }

    public static int add_purse ( int numOfPurses){
        // you will need these functions to be able to return a value so you can use
        // them in other functions
            System.out.print("You have " + numOfPurses + " purses. How many do you want to add?");
            Scanner keyboard = new Scanner(System.in);
            int addPurse = keyboard.nextInt();
            numOfPurses += addPurse;
            System.out.println("You now have " + numOfPurses + " purses. ");
        return numOfPurses;
        }


    public static int remove_purse(int numOfPurses) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("You have " + numOfPurses + " purses. How many to remove? ");
            int removePurse = keyboard.nextInt();
            int leftOverPurses = numOfPurses - removePurse;
            System.out.println("You now have " + leftOverPurses + " purses. ");
            return leftOverPurses;
        }
    public static void vieworder(int numOfPurses, int price, double salesTax, double shippingCost, double additonalSC) {

        System.out.println("You have " + numOfPurses + " purses. " );
        System.out.println("Purses cost $" + price + " each");
        shippingCost = 15.00;
        additonalSC = 1.00;
        salesTax = 0.0825;
        double totalShipping = shippingCost + (numOfPurses - 1) * additonalSC;
        System.out.println("The total shipping cost is $" + totalShipping);
        double subTotal = totalShipping + (numOfPurses * price);
        System.out.println("The subtotal before tax is $" + subTotal);
        System.out.println("The tax on your order is $" + (salesTax * subTotal));
        double totalCost = (salesTax * subTotal) + subTotal;
        System.out.println("Total cost is $" + totalCost);

    }

    public static void checkout(int numOfPurses, int price, double salesTax, double shippingCost, double additonalSC) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CHECKOUT");

        System.out.println();
        System.out.print("We want to make sure the order is delivered correctly. What is your name? ");
        String customerName = keyboard.nextLine();
        vieworder(numOfPurses,price,salesTax,shippingCost,additonalSC);
        System.out.println("Thanks for your order, " + customerName);
        System.out.println("Remember to not whawhahwhwha spill lipstick in your Valentino white bag ");

    }
}
