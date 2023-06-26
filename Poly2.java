/*Create a base class called Shape with a method draw(). Derive two classes Rectangle and Circle from Shape. Implement the draw() method in each derived class to draw the respective shape on the console using ASCII characters. Use polymorphism to create objects of Rectangle and Circle and call the draw() method on each object.*/
abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

   
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    
    public void draw() {
        int diameter = radius * 2;
        int centerX = radius;
        int centerY = radius;

        for (int y = 0; y <= diameter; y++) {
            for (int x = 0; x <= diameter; x++) {
                double distance = Math.sqrt((x - centerX) * (x - centerX) + (y - centerY) * (y - centerY));
                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        rectangle.draw();
        System.out.println();
        circle.draw();
    }
}
