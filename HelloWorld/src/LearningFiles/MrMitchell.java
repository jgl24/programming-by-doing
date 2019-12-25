package LearningFiles;
import java.net.URL;
import java.util.Scanner;

public class MrMitchell
{
    public static void main(String[] args) throws Exception
    {
        URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
        Scanner webIn = new Scanner( mcool.openStream() );

        String one = webIn.nextLine();
        String two = webIn.nextLine();

        webIn.close();

        System.out.println(one);
        System.out.println(two);
    }
}