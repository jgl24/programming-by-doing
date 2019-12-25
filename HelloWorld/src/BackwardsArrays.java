public class BackwardsArrays {
    public static void main(String[] args) {
        int[] DM = {5, 1, 5};
        int[] MC = {6, 4, 1};
        int[] SEA = {4, 1, 2};
        int x = 0;
        int y = 0;
        int z = 0;
        int common = 0;
        for (x = 0; x < DM.length; x++) {

        for (y = 0; y < MC.length; y++) {

        for (z = 0; z < SEA.length; z++) {
            if (SEA[z] == MC[y] || SEA[z] == DM[x])
                    System.out.println(SEA[z]);
            }
        }

                        }
                    }
                }




// write a program that takes three arrays and prints the common elements any of them have with each other
//