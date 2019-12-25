import java.awt.*;
import java.util.Scanner;
public class ShapesArea{

    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);

        int shape = 0;
        while (shape != 5){

            // there is a better way to loop this so you don't have to put
            // a System.out.print("Which shape: "); after each if argument

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("1) Circle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Triangle");
            System.out.println("5) Quit");
            System.out.println("");
            System.out.print("Which shape: ");
            shape = keyboard.nextInt();
            keyboard.nextLine();

            if(shape == 1){
                System.out.print("Radius: ");
                int radius = keyboard.nextInt();
                double area = area_circle(radius);// here your passing in the function and STORING it so you can actually print it :)
                System.out.println(area);

            }
            if(shape == 2){
                System.out.print("length: ");
                int length = keyboard.nextInt();
                System.out.println();
                System.out.print("width: ");
                int width = keyboard.nextInt();
                int area = area_rectangle(length,width);
                System.out.println(area);


            }
            if(shape == 3){
                System.out.print("Side length: ");
                int sideLength = keyboard.nextInt();
                int area = area_square(sideLength);
                System.out.println(area);


            }
            if(shape == 4){
                System.out.print("base: ");
                int base = keyboard.nextInt();
                System.out.println();
                System.out.print("height: ");
                int height = keyboard.nextInt();
                double area = area_triangle(base,height);
                System.out.println(area);

            }


        } System.out.println("Goodbye.");
    }

    public static double area_circle( int radius ) {
        double areaCirc = Math.PI * (radius * radius);

        return areaCirc;
    }
    public static int area_rectangle ( int length, int width ){
        int areaRect = length * width;
        return areaRect;
    }
    public static int area_square( int side ){
        int areaSqu = side * side;
        return areaSqu;

    }
    public static double area_triangle( int base, int height ){
        int areaTri = (base * height)/2;
        return areaTri;

    }
}