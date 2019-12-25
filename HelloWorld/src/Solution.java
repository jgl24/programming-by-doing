public class Solution {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        Cat grumpyCat = new Cat();
        Woman sally = new Woman();
        sally.name = "Sally";
        Woman suzie = new Woman();
        suzie.name = "Suzie";

        kitty.owner = sally;
        grumpyCat.owner = sally;

        System.out.println(kitty.owner.name);
        System.out.println(grumpyCat.owner.name);


    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
        public String name;
    }
}

// here's an idea Jose ----> practice concepts here you're introduced to them.