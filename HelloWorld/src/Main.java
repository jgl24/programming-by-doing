class Car {
    private int cylinders;
    private boolean engine;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public boolean getEngine() {
        return engine;
    }

    public String startEngine() {
        return "Car ---> start your engines";
    }

    public String accelerate() {
        return "Car ---> accelerate";
    }

    public String brake() {
        return "Car ----> break";
    }
}

class Honda extends Car {
    public Honda(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Honda ---> start your engines";
    }

    @Override
    public String accelerate() {
        return "Honda ---> accelerate";
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "base care");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());


        Honda honda = new Honda(6, "eclipse");
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
    }
}





