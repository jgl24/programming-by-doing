import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = keyboard.nextLine();
        int i = 0;
        if(name.equals("Mitchell")) {
            i = 5;
        }

        for(; i < 10; i++){
            System.out.println(name);
        }
    }
}


