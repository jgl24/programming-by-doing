public class Floor {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
    }

    private double width;
    private double length;

    public Floor(double width, double length) {

        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }

    }

    public double getArea() {
        return width * length;
    }

}