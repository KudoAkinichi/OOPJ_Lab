// WAP in java to create a class complex having data members real and imaginary. Initialize real and imaginary value to 0 using default constructor, Initialize 2 complex number using parameter constructor, perform addition & subtraction in 2 different parameterized constructor and display the result.

public class ComplexDemo {

    static class Complex {
        // Data members
        private double real;
        private double imaginary;

        // Default constructor to initialize real and imaginary to 0
        public Complex() {
            this.real = 0;
            this.imaginary = 0;
        }

        // Parameterized constructor to initialize complex number with given real and imaginary values
        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        // Parameterized constructor for addition and subtraction
        public Complex(Complex num1, Complex num2, String operation) {
            if (operation.equals("add")) {
                this.real = num1.real + num2.real;
                this.imaginary = num1.imaginary + num2.imaginary;
            } else if (operation.equals("subtract")) {
                this.real = num1.real - num2.real;
                this.imaginary = num1.imaginary - num2.imaginary;
            }
        }

        // Display method to print the complex number
        public void display() {
            System.out.println("Complex Number: " + real + " + " + imaginary + "i");
        }
    }

    public static void main(String[] args) {
        // Creating complex numbers using the default constructor
        Complex defaultComplex = new Complex();
        System.out.println("Default Complex Number:");
        defaultComplex.display();

        // Creating complex numbers using the parameterized constructor
        Complex num1 = new Complex(3.0, 4.0);
        Complex num2 = new Complex(1.5, 2.5);

        // Performing addition
        Complex sum = new Complex(num1, num2, "add");
        System.out.println("\nAfter Addition:");
        sum.display();

        // Performing subtraction
        Complex difference = new Complex(num1, num2, "subtract");
        System.out.println("\nAfter Subtraction:");
        difference.display();
    }
}
