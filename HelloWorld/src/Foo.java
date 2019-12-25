public class Foo {

    public static void main(String[] args) {
        String[] smallestWord = {"cat", "tiger", "lion", "cougar"};

        String smallest = "A really long super long string";

        for (int x = 0; x < smallestWord.length; x++) {
            String currentWord = smallestWord[x];
            if (smallest.length() > currentWord.length()) {
                smallest = currentWord;
            }
        }

        System.out.println(smallest);
    }
}