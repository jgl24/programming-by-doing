public class IsEvenFunctions {
    public static void main(String[] args){
        for(int i = 1; i < 21; i++){
            if (isEven(i) == true && isDivisibleBy3(i) == false){
                System.out.println( i + " <");
                }
            if(isDivisibleBy3(i) == true && isEven(i) == false) {
                System.out.println(i + " =");
            }
            if(isEven(i) == true && isDivisibleBy3(i) == true){
                System.out.println(i + " <=");
            } else if (isEven(i) == false && isDivisibleBy3(i) == false){
                System.out.println(i);
            }

        }
    }
    public static boolean isEven(int n){
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isDivisibleBy3(int n){
        if (n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
