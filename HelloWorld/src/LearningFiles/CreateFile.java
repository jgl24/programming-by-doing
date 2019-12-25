package LearningFiles;
import java.io.File; // Import the File class
import java.io.IOException; // Import IOException class to handle errors


public class CreateFile {
    public static void main(String[] args){
        try {
            File myObject = new File("JosesFile.txt");
            if(myObject.createNewFile()){
                System.out.println("File created was: " + myObject.getName());
            } else{
                System.out.println("File already exisits");
            }
        } catch (IOException e) {
            System.out.println("An error occured. ");
            e.printStackTrace();
            // ask Kyle what this does
        }
    }
}
