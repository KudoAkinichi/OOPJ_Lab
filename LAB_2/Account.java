// Q4. WAP in java to create a class account having data members account number , name ,branch , bank name, balance. now take member functions: void getaccountinformation() function to input account details, display function to display account information, withdraw and deposit function to withdraw and deposit amount into existing balance. Display at least 3 account details with the help of array of objects concept.


import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String name;
    private String branch;
    private String bankName;
    private double balance;


    public void getAccountInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Branch: ");
        branch = scanner.nextLine();
        System.out.print("Enter Bank Name: ");
        bankName = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = scanner.nextDouble();
    }


    public void display() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Balance: " + balance);
    }

    // Function to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Function to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public static void main(String[] args) {

        Account[] accounts = new Account[1];

        // Input account details for each account
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            System.out.println("Enter details for Account " + (i + 1) + ":");
            accounts[i].getAccountInformation();
        }


        System.out.println("\nDisplaying Account Information:");
        for (Account acc : accounts) {
            acc.display();
            System.out.println();
        }

        accounts[0].withdraw(500.0);
        accounts[0].deposit(1000.0);
    }
}
