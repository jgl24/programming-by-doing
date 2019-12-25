import java.util.Scanner;

// Write a program to change the case of each character in a string using nested loops
public class LowerCase {
    public static void main(String[] args) {
        Scanner strings = new Scanner(System.in);
        System.out.println("please type a sentence here: ");
        String str = strings.next();
        str = str.replaceAll("a-z", "A-Z");
        str = str.replaceAll("A-Z" , "a-z");
        System.out.println(str);
    }
}
