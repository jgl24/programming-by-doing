public class HelloWorld {
    public static void main(String[] args) {
       String[] longestWord = {"hey", "hello", "hi", "hola"};
        for (int x = 0; x < longestWord.length; x++) {
            String greeting = longestWord[x];
            System.out.println(greeting);
            System.out.println(greeting.length());
        }
    }
}