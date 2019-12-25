package LearningFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class puzzlesPt2 {
     public static void main(String[] args){
         Scanner keyboard = new Scanner(System.in);
         System.out.print("Open which file: ");
         String userFileChoice = keyboard.nextLine();

         try{
             File myObject = new File(userFileChoice);
             Scanner myFileReader = new Scanner(myObject);
             while (myFileReader.hasNextLine()){
                 String tracker = myFileReader.next();
                 for(int i = 0; i < tracker.length(); i++){
                     if(tracker.charAt(i) == 'a' ||
                        tracker.charAt(i) == 'e' ||
                        tracker.charAt(i) == 'i' ||
                        tracker.charAt(i) == 'o' ||
                        tracker.charAt(i) == 'u') {
                         char c = Character.toUpperCase(tracker.charAt(i));
                         System.out.print(c);
                     } else {
                         System.out.print(tracker.charAt(i));
                     }
                 }

             }

         } catch (FileNotFoundException e){
             System.out.println("sorry, file not found ");

         }
     }
}
