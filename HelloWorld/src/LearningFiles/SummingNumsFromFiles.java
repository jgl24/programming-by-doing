package LearningFiles;
import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SummingNumsFromFiles {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which file would you like to read numbers from: ");
        String fileChoice = keyboard.nextLine();
        try {
            File myObject = new File(fileChoice);


            Scanner fileReader = new Scanner(myObject);
            int i = 0;
            int sum = 0;
            while(i < 3) { // ask about .hasNextLine
                int num = fileReader.nextInt();
                sum += num;
                i++;
                if(i <= 2){
                    System.out.print(num + " + ");
                } else{
                    System.out.print(num);
                }
            }  System.out.println(" = " + sum);



            fileReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occured ");
            e.printStackTrace();
        }

    }

}