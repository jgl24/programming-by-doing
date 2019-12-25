import java.util.Scanner;

// Write a program to determine if the given character (‘v’) is found in an input string.
// Use a while loop to test each letter in the input.
// If the test character is found in the input String print “Found” otherwise print “Not Found”.
public class FoundChar {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char test= 'v';// Character input
        char[] newChar =  input.toCharArray();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            if (newChar[i] == 'v') {
                System.out.println("found a V");
                i = length;
            } else {
                System.out.println("not found!");
                i = length;
            }
        }
    }
}
