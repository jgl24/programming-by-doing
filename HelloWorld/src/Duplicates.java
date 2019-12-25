import javax.swing.*;

public class Duplicates {
    public static void main(String[] args) {
        int duplicates[] = {2, 4, 3, 9};
        int x = 0;
        int z = 0;
        boolean foundDuplicate = false;

        for (x = 0; x < duplicates.length; x++) {
            for (z = x + 1; z < duplicates.length; z++) {

                if (duplicates[x] == duplicates[z]) {
                    System.out.println("these are the duplicates..." + duplicates[x]);
                    foundDuplicate = true;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("-1");
        }
    }
}






// print the duplicate numbers in an array, if the array has no duplicate numbers print -1