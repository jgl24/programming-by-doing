import javax.swing.*;
import java.util.Scanner;

class Sapples {
    public static void main (String args []) {
        Scanner bucky = new Scanner (System.in);
        String fname, sname, tname, answer;
        System.out.println("Enter first name: ");
        fname = bucky.nextLine();
        System.out.println("Enter second name: ");
        sname = bucky.nextLine();
        System.out.println("Enter third name: ");
        tname = bucky.nextLine();
        answer = fname + " " + sname + " " + tname;
        System.out.println(answer);

        int girls = 3;
        girls *= 4; // so girls *= 4 is the same as saying girls = girls *  4
        System.out.println(girls);
    }
}
