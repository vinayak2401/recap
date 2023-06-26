/*Implement a Java class hierarchy for a vehicle rental system. Create a base class called Vehicle, which has properties like model, make, and rentalPrice, and methods like displayDetails(). Then create subclasses like Car, Motorcycle, and Bicycle, which inherit from Vehicle and have their own specific properties and methods. For example, the Car class can have a property called numDoors and a method called startEngine(), while the Motorcycle class can have a property called engineCapacity and a method called wheelie(). Test the implementation by creating instances of different vehicle classes and calling their methods.*/
class Vehicle {
  private String model;
  private String make;
  private double rentalPrice;

  public Vehicle(String model,String make,double rentalPrice){
    this.model=model;
    this.make=make;
    this.rentalPrice=rentalPrice;
  }
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public double getRentalPrice() {
    return rentalPrice;
  }

  public void setRentalPrice(double rentalPrice) {
    this.rentalPrice = rentalPrice;
  }

  public void displayDetails() {
    System.out.println("Model: " + model);
    System.out.println("Make: " + make);
    System.out.println("Rental Price: " + rentalPrice);
  }
}

class Car extends Vehicle {
  private int numDoors;

  public Car(String model, String make, double rentalPrice, int numDoors) {
    super(model, make, rentalPrice);
    this.numDoors = numDoors;
  }

  public void startEngine() {
    System.out.println("Starting the engine of the car");
  }
}

class MotorCycle extends Vehicle {
  private String engineCapacity;

  public MotorCycle(String model, String make, double rentalPrice, String engineCapacity) {
    super(model, make, rentalPrice);
    this.engineCapacity = engineCapacity;
  }

  public void wheelie() {
    System.out.println("Motorcycle can do wheelie");
  }
}

class Bicycle extends Vehicle {
  private String discBrake;

  public Bicycle(String model, String make, double rentalPrice, String discBrake) {
    super(model, make, rentalPrice);
    this.discBrake = discBrake;
  }

  public void hillRacer() {
    System.out.println("Bicycle is able to climb the hill");
  }
}

class Main {
  public static void main(String args[]){
    Vehicle v=new Vehicle("Nexon","Tata",2500);
    v.displayDetails();

    Car c=new Car("Harrier","Tata",4000,4);
    c.displayDetails();
    c.startEngine();

    MotorCycle mc=new MotorCycle("Motorsport","BMW",1500,"1000cc");
    mc.displayDetails();
    mc.wheelie();

    Bicycle b=new Bicycle("King","Hercules",300,"Yes");
    b.displayDetails();
    b.hillRacer();
  }
}