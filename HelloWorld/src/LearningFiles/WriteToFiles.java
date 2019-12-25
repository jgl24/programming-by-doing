package LearningFiles;

import java.io.FileWriter; // imports FileWriting class
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFiles {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("3nums.txt");
            PrintWriter pw = new PrintWriter(myWriter);
            // you need a print writer to allow you to print to your file
            // you reference your File writer by calling it by name

            pw.println(3);
            pw.println(3);
            pw.println(4);

            pw.close(); // you always have to close or nothing will print
        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace(); // again as what this is all about
        }
    }
}
