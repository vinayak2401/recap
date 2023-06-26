/*Create a base class called Shape with a method calculateArea(). Derive three classes Rectangle, Circle, and Triangle from Shape. Implement the calculateArea() method in each derived class to calculate the area of the respective shape. Use polymorphism to create an array of Shape objects and call the calculateArea() method on each object.*/
import java.util.ArrayList;

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return  radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

 class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(4.0, 5.0));
        shapes.add(new Circle(3.5));
        shapes.add(new Triangle(2.0, 3.0));

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            System.out.println("Area: " + area);
        }
    }
}
