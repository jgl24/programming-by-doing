package LearningFiles;
import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args){
        try {
            File myObject = new File("3nums.txt");
            Scanner fileReader = new Scanner(myObject);
            int i = 0;
            int sum = 0;
            while(i <= 3) { // ask about .hasNextLine
                int num = fileReader.nextInt();
                System.out.print(num + " + ");
                sum += num;
                i++;
                System.out.println("= " + sum);
            }



            fileReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occured ");
            e.printStackTrace();
        }

    }

}