import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class GradesArrayFile {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Name (first last): ");
        String userName = keyboard.nextLine();
        System.out.print("Filename: ");
        String fileName = keyboard.nextLine();

        int grades[] = new int[5];

        for(int i = 0; i < grades.length; i++){
            grades[i] = 1+ rand.nextInt(100);
        }
        try{
            FileWriter myFileWriter = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(myFileWriter);

            pw.println(userName);
            pw.println();

            for(int i = 0; i< grades.length; i++){
                pw.print(grades[i] + " ");
            }
            pw.close();


        } catch (IOException e){
            System.out.println("There was an error :( ");
        }
    }
}
