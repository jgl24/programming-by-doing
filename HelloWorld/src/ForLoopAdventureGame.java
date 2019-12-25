import java.util.Scanner;

public class ForLoopAdventureGame {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("MITCHELL'S TINY ADVENTURE 2!");
        System.out.println();
        int nextroom = 1;
        String choice = "";
        while (nextroom != 0) {
            // room 1 = downstairs
            // room 2 = upstairs
                //room 4 = bedroom
                //room 5 = bathroom
            // room 3 = kitchen
            //room 6 = refridgerator

            if (nextroom == 1) {
                System.out.println( "You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
                        System.out.print("> ");
                choice = keyboard.nextLine();
                if (choice.equals("upstairs")) {
                    nextroom = 2;
                } else if (choice.equals("kitchen")) {
                    nextroom = 3;
                } else {
                    System.out.println(" ERROR. ");
                }
            }
            if (nextroom == 2) {
                System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\". " +
                                    "There is also a \"bathroom\" off the hallway. " +
                                    "Or, you can go back \"downstairs\". Where would you like to go?");
                System.out.print("> ");
                choice = keyboard.nextLine();
                if (choice.equals("bedroom")){
                    nextroom = 4;
                } else if (choice.equals("bathroom")){
                    nextroom = 5;
                } else if (choice.equals("downstairs")) {
                    nextroom = 1;
                } else{
                    System.out.println(" ERROR. ");
                }
            }
            if(nextroom == 3) {
                System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                        "there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\"\n" +
                        "or go \"back\".");
                System.out.print("> ");
                choice = keyboard.nextLine();
                if(choice.equals("refrigerator")) {
                    nextroom = 6;
                } else if (choice.equals("back")) {
                    nextroom = 1;
                } else {
                    System.out.println(" ERROR. ");
                }
            }
            if(nextroom == 4){
                System.out.println("You walk in the bedroom and notice a bong. You can take a \"hit\" or you can go \"back\".");
                System.out.print("> ");
                choice = keyboard.nextLine();
                if(choice.equals("hit")){
                    System.out.println("It was a sting! Kamala Harris jumps out of the closet and arrests you. You get life in prison");
                    nextroom = 0;
                } else if(choice.equals("back")) {
                    nextroom = 2;
                } else {
                    System.out.println(" ERROR. ");
                }
            }
            if (nextroom == 5) {
                System.out.println("You enter the bathroom and notice someone didn't change the toliet paper roll. Do you \"change\" it or do you go \"back\"?");
                System.out.print("> ");
                choice = keyboard.nextLine();
                if(choice.equals("change")) {
                    System.out.println("Congrats the ghost haunting the house was a stickler for having the roll changed. He appreciates your efforts and lefts you leave unbothered.");
                    nextroom = 0;
                } else if(choice.equals("back")) {
                    nextroom = 2;
                } else {
                    System.out.println(" ERROR. ");
                }
            }
            if (nextroom == 6){
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\") or you can go \"back\"");
                System.out.println("> ");
                choice = keyboard.nextLine();
                if(choice.equals("yes")) {
                    System.out.println("The food is slimy and foul, but you manage to choke it down. Your stomach\n" +
                            "starts jumping like a frog in hot water.  You feel faint. Sliding to the\n" +
                            "floor, the darkness closes in.");
                    nextroom = 0;
                }
                else if (choice.equals("no")){
                    System.out.println("Good call, the food was poisoned. You've been snooping around enough. Get out of here before it gets dark and the ghosts come out to play.");
                    nextroom = 0;
                }
                else {
                    System.out.println(" ERROR. ");
                }
            }
        }
        System.out.println("\nEND.");
    }
}
