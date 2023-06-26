/*Create an abstract class called Vehicle with properties color and fuelType. Add an abstract method startEngine(). Derive two classes Car and Motorcycle from Vehicle. Implement the startEngine() method in each derived class to print a message indicating the vehicle type and engine start. Use abstraction to ensure that the startEngine() method is implemented in each derived class.*/
abstract class Vehicle {
    private String color;
    private String fuelType;

    public Vehicle(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }

    public abstract void startEngine();

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }
}

class Car extends Vehicle {
    public Car(String color, String fuelType) {
        super(color, fuelType);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the " + getColor() + " car with " + getFuelType() + " engine");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String color, String fuelType) {
        super(color, fuelType);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the " + getColor() + " motorcycle with " + getFuelType() + " engine");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Red", "Petrol");
        Vehicle motorcycle = new Motorcycle("Black", "Diesel");

        car.startEngine();
        motorcycle.startEngine();
    }
}
