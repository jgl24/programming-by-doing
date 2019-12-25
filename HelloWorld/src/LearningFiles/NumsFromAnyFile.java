package LearningFiles;
import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class NumsFromAnyFile {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which file would you like to read numbers from: ");
        String fileChoice = keyboard.nextLine();
        try {
            File myObject = new File(fileChoice);


            Scanner fileReader = new Scanner(myObject);
            int sum = 0;
            while(fileReader.hasNextLine()) { // ask about .hasNextLine
                // checks to see if there's another element there
                int num = fileReader.nextInt(); // reads next element
                sum += num;
                if(fileReader.hasNextLine()){
                    System.out.print(num + " + ");
                } else{
                    System.out.print(num);
                }
            }  System.out.println(" = " + sum);



            fileReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occured ");
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            System.out.println("remember to put in an integer");
        }

    }

}