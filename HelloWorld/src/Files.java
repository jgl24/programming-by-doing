import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        File ExampleFile = new File("test.txt");

        // Write name and age to file
        try {
            PrintWriter outputTExt = new PrintWriter(ExampleFile);
            outputTExt.println("Jose Lopez");
            outputTExt.println(23);
            outputTExt.close();
        } catch(IOException ex){
            System.out.printf("ERROR: %s", ex);
        }
        try {
            Scanner keyboard = new Scanner(ExampleFile);
            String name = keyboard.nextLine();
            int age = keyboard.nextInt();

            System.out.printf("Name: %s Age %d\n", name, age);
        } catch (FileNotFoundException ex){
            System.out.printf("ERROR: %s", ex);
        }
    }
}
