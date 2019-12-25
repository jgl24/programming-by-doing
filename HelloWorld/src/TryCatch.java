import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int i;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter an integer between 1 and 10: ");
        try{
            i = keyboard.nextInt();
            if(i < 1 || i > 10) throw new IntegerOutOfRangeException();

            // ask what THROW is
            //

        } catch (InputMismatchException fff) {
            System.out.println("you didnt input an integer lol ");
            // fff is the name of exception object
        } catch (IntegerOutOfRangeException fff) {
            System.out.println("Your input value is not in range ");
        }
    }
}
 class IntegerOutOfRangeException extends Exception {
 // can read extends as "is a"
}

// ask Kale why this doesnt need to be declared as a public class like it does in the video
// also what does the 'extends' do??
// Exception class?? need more detail on that I think