abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    void calculatePerimeter() {
        System.out.println("Circle Perimeter: " + (2 * Math.PI * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    void calculatePerimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (length + breadth)));
    }
}

class Triangle extends Shape {
    double base, height, side1, side2, side3;

    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void calculateArea() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }

    void calculatePerimeter() {
        System.out.println("Triangle Perimeter: " + (side1 + side2 + side3));
    }
}
class Main {
    public static void main(String[] args) {
        Shape s[] = new Shape[3];

        s[0] = new Circle(5);
        s[1] = new Rectangle(10, 5);
        s[2] = new Triangle(6, 4, 5, 5, 6);

        for (Shape shape : s) {
            shape.calculateArea();
            shape.calculatePerimeter();
            System.out.println();
        }
    }
}