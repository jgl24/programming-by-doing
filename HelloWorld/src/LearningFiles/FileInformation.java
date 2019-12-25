package LearningFiles;
import java.io.File; // imports File class
public class FileInformation {
    public static void main(String[] args){
        File myObject = new File("JosesFile.txt");
        if(myObject.exists()){
            System.out.println("The file is named: "+ myObject.getName());
            System.out.println("The absolute path is: " + myObject.getAbsolutePath());
            System.out.println("Writeable: " + myObject.canWrite());
            System.out.println("Readable: " + myObject.canRead());
            System.out.println("File size in bytes: " + myObject.length());
        } else{
            System.out.println("The file does not exisit ");
        }
    }

}
