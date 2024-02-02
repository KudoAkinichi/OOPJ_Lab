// WAP in java to perform following operations using command line arguments concept
// 1. Display any five names where these names should be taken from command line.
// 2. find simple interest by taking the values p,t,r from command line.

public class CommandLineArguments {

    
    static void displayNames(String[] names) {
        System.out.println("Displaying names:");

        for (String name : names) {
            System.out.println(name);
        }
    }

    
    static void calculateSimpleInterest(String[] args) {
        if (args.length < 3) {
            System.out.println("Insufficient arguments for calculating simple interest. Provide values for principal, time, and rate.");
            return;
        }

        try {
            double principal = Double.parseDouble(args[0]);
            double time = Double.parseDouble(args[1]);
            double rate = Double.parseDouble(args[2]);

            double simpleInterest = (principal * time * rate) / 100;

            System.out.println("Principal: " + principal);
            System.out.println("Time: " + time);
            System.out.println("Rate: " + rate);
            System.out.println("Simple Interest: " + simpleInterest);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid numeric values for principal, time, and rate.");
        }
    }

    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
            return;
        }

        
        displayNames(args);
        System.out.println(); 

        calculateSimpleInterest(args);
    }
}
