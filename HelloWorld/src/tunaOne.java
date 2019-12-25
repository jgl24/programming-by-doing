import java.util.Scanner;
public class tunaOne {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("LETS PLAY A GAME ;)");
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
        String upORkitchen = keyboard.nextLine();
        if (upORkitchen.equals("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere. " +
                    "Off to one side there is, as you'd expect, a refrigerator. " +
                    "You may open the \"refrigerator\" or look in a \"cabinet\"");

            String fridgeORcab = keyboard.nextLine();
            if (fridgeORcab.equals("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\" Would you like to eat some of the food? (\"yes\" or \"no\")");
                String yORn = keyboard.nextLine();
                if (yORn.equals("yes")) {
                    System.out.println("The food was poisoned... youre dead");   /// ending 1
                } else if (yORn.equals("no")) {
                    System.out.println("You die of starvation... eventually.");       /// ending  2
                }
            } else if (fridgeORcab.equals("cabinet")) {
                System.out.println("You are starving. Inside the cabinet you see a secret door . Would you like to open it? (\"yes\" or \"no\")");
                String yesOno = keyboard.nextLine();
                if (yesOno.equals("yes")) {
                    System.out.println("You open the door and... out pops Megan Thee Stalion . You tell her you're hungry, to which she replies \" you hungry? well my pussy the kitchen\" " +
                            " She has no actual food so you starve");   /// ending 3
                } else if (yesOno.equals("no")) {
                    System.out.println("You decide to leave the secret door alone and moments later a random man walks in and grabs a suitcase full of money out of the door. " +
                            "He doesn't want to leave a witness so he shoots you. You die broke and alone lol ");     /// ending 4
                }
            }


        }
        if (upORkitchen.equals("upstairs")) {
            System.out.println("Upstairs you see a hallway.  " +
                    "At the end of the hallway is the master \"bedroom.\"  " +
                    "There is also a \"bathroom\" off the hallway.  Where would you like to go?");
            String bathObed = keyboard.nextLine();
            if (bathObed.equals("bedroom")) {
                System.out.println("You go in and notice a bong next to the bed. Do you take a hit?");
                String hit = keyboard.nextLine();
                if (hit.equals("yes")) {
                    System.out.println("It was a sting. Kamala Harris jumps out of the closet and charges you with possesion ");
                } else if (hit.equals("no")) {
                    System.out.println(" okay loser... ");
                }
            }

            if (bathObed.equals("bathroom")) {
                System.out.println(" You see a beautifly drawn bath... candles, bubbles, even champagne. Do you go in? ");
                String bathORnot = keyboard.nextLine();
                if (bathORnot.equals("yes")) {
                    System.out.println(" After a bit of champagne you start to slowly drift off to sleep and you don't notice someone else enter the bathroom... it is... TROY. You decide to chug the rest of the champagne and drown yourself before he starts talking ");
                } else if (bathORnot.equals("no")) {
                    System.out.println(" Congrats this is the only storyline where you don't die :) ");
                }


            }
            System.out.println("THANKS FOR PLAYING");
        }
    }
}

