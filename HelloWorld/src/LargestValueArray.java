import java.util.Random;

public class LargestValueArray {
    public static void main(String[] args){
        int arrayOne[] = new int[10];
        int largestNum = 0;
        int currentSlot = 0;
        int largestSlot = 0;
        Random rand = new Random();

        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = 1+ rand.nextInt(100);
            if(arrayOne[i] > largestNum){
                largestNum = arrayOne[i];
                largestSlot = currentSlot;
            }
            currentSlot++;
        }
        System.out.print("Array: ");

        for(int i = 0; i < arrayOne.length; i++){
            System.out.print(arrayOne[i] + "  ");
        }
        System.out.println();
        System.out.println("The largest value is " + largestNum);
        System.out.println("It is in slot " + largestSlot);
    }
}
