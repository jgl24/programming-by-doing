public class SampleFunctions {
    public static void main(String[] args) {
        String[] values = {"hi", "hello"};
        printArray(values);
        String[] otherStuff = {"no", "yes"};
        printArray(otherStuff);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
