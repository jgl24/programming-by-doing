package LearningFiles;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class FilesPuzzle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Open which file: ");
        String userFileChoice = keyboard.nextLine();

        try {
            File myObject = new File(userFileChoice);
            Scanner myFileReader = new Scanner(myObject);
            while (myFileReader.hasNextLine()){
                String tracker = myFileReader.next();
                for(int i = 2; i < tracker.length(); i += 3){
                    System.out.print(tracker.charAt(i));
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("That file wasn't found");
        }

    }
}
