import java.util.Scanner;

// Write a program to change the case of each character in a string using nested loops
public class SwitchCases {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type something here: ");
        String s = scanner.nextLine();
        char[] str = s.toCharArray(); // change string to char array
        int ln = s.length();
        for(int i = 0; i < ln; i++) {
                if(str[i] >= 'a' && str[i] <= 'z') {
                    str[i] = (char) (str[i] - 32); // cast result of str[i] - 32 to char
                } else if (str[i] >= 'A' && str[i] <= 'Z') {
                    str[i] = (char) (str[i] + 32); // cast result of str[i] + 32 to char
                }

            } System.out.println(str);
    }
} // Hello Victoria Victor Very Valuable
// if (str[i] == 'V') {
//System.out.println("found a V");





//Use string split function to split the sentence into array of words
//The first loop should iterate through each word
//The second loop should iterate through each character of the work and change the casing
//Print the changed casing words in a single line
