import java.util.Random;
public class ArrayPractice {
    public static void main(String[] args) {
        Random rand = new Random();
        int arrayOne[] = new int[10];
        int arrayTwo[] = new int[10];

        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = 1+ rand.nextInt(100); // this loop will set all the elements in array one to a random number
        }

        for(int i = 0; i < arrayTwo.length; i++){
            arrayTwo[i] = arrayOne[i]; // this loop copies all elements over to arrayTwo
        }

//        arrayTwo = arrayOne; ask Kyle why this sets both 9th elements equal to -7
        // when you don't set it equal to -7 until line 18

        arrayOne[9] = -7; // this will change the last # in arrayOne to -7

        System.out.print("Array one: ");
        for(int i = 0; i < arrayOne.length; i++){
            System.out.print(arrayOne[i] + " "); // this should print all elements in arrayOne (including the -7)
        }
        System.out.println();
        System.out.print("Array two: ");
        for(int i = 0; i < arrayTwo.length; i++){
            System.out.print(arrayTwo[i] + " ");
        }
    }
}