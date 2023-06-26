/*Create a base class called Vehicle with properties color and fuelType and a method startEngine(). Derive two classes Car and Motorcycle from Vehicle. Implement the startEngine() method in each derived class to print a message indicating the vehicle type and engine start.*/
class Vehicle{
  private String color;
  private String fuelType;

  public Vehicle(String color,String fuelType){
    this.color=color;
    this.fuelType=fuelType;
  }
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
  public void startEngine(){
    System.out.println("Starting the engine of vehicle");
  }
}
class Car extends Vehicle{
  public Car(String color,String fuelType){
    super(color, fuelType);
  }
  public void startEngine(){
    System.out.println("Starting the engine of Car");
  }
}
class MotorCycle extends Vehicle{
  public MotorCycle(String color,String fuelType){
    super(color, fuelType);
  }
  public void startEngine(){
    System.out.println("Starting the engine of motorcycle");
  }
}
class Main{
  public static void main(String args[]){
    Vehicle v=new Vehicle("Biege","Diesel");
    v.startEngine();
    Car c=new Car("Red","Petrol");
    c.startEngine();
    MotorCycle mc=new MotorCycle("Green","Electric");
    mc.startEngine();
  }
}