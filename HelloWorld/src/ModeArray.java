public class ModeArray {

    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 7, 3, 7, 7};
        int element = 0;
        int count = 0;
        for (int x = 0; x < arr.length; x++) {
            int tempElement = arr[x];
            int tempCount = 0;
            for (int z = 0; z < arr.length; z++) {
                if (arr[z] == tempElement)
                    tempCount++;
            if (tempCount > count) {
                element = tempElement;
                count = tempCount;
                  }

                }
            } System.out.println("Here is the most common element: " +  element + " freq: " + count);

        }
    }









    //Write a program that prints out the mode of an array and how many times it occurs