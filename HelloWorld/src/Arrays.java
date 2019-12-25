import java.util.Random;
public class Arrays {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbz = new int[1000];
        System.out.println();
        for (int i = 0; i < numbz.length; i++) {
            for (int j = 0; j <= 20; j++) {
                numbz[i] = 10 + rand.nextInt(89);
                System.out.print(numbz[i]);
                System.out.print("  ");
            } System.out.println();
        }
    }
}

