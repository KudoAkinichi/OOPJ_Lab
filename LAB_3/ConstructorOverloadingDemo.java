// WAP to demonstrate constructor overloading in which you have find area of sphere, cuboid , circle.

public class ConstructorOverloadingDemo {

    static class Shape {
        // Common variable for all shapes
        private double area;

        // Constructor for sphere
        public Shape(double radius) {
            area = 4 * Math.PI * Math.pow(radius, 2);
            System.out.println("Area of Sphere: " + area);
        }

        // Constructor for cuboid
        public Shape(double length, double width, double height) {
            area = 2 * (length * width + width * height + height * length);
            System.out.println("Area of Cuboid: " + area);
        }

        // Constructor for circle
        public Shape(double radius, boolean isCircle) {
            if (isCircle) {
                area = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of Circle: " + area);
            } else {
                // Do nothing for other shapes
                System.out.println("Invalid shape");
            }
        }
    }

    public static void main(String[] args) {
        // Creating instances of Shape class with different constructors
        Shape sphere = new Shape(3.0); // Area of Sphere
        Shape cuboid = new Shape(2.0, 3.0, 4.0); // Area of Cuboid
        Shape circle = new Shape(5.0, true); // Area of Circle
    }
}
