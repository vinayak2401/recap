/*Create an abstract class called Shape with an abstract method calculateArea(). Derive three classes Rectangle, Circle, and Triangle from Shape. Implement the calculateArea() method in each derived class to calculate the area of the respective shape. Use abstraction to ensure that the calculateArea() method is implemented in each derived class.
*/
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

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.0, 5.0);
        Shape circle = new Circle(3.5);
        Shape triangle = new Triangle(2.0, 3.0);

        double rectangleArea = rectangle.calculateArea();
        double circleArea = circle.calculateArea();
        double triangleArea = triangle.calculateArea();

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Triangle Area: " + triangleArea);
    }
}
