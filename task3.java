import java.util.*;
import java.io.*;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1- Check Balance");
        System.out.println("2- Deposit");
        System.out.println("3- Withdraw");
        System.out.println("4- Exit");
    }

    public void processOption(int option) {
        Scanner sc = new Scanner(System.in);

        switch (option) {
            case 1:
                System.out.println("Current Balance: " + userAccount.getBalance());
                break;

            case 2:
                System.out.println("Enter deposit amount:");
                double depositAmount = sc.nextDouble();
                userAccount.deposit(depositAmount);
                break;

            case 3:
                System.out.println("Enter withdrawal amount:");
                double withdrawalAmount = sc.nextDouble();
                userAccount.withdraw(withdrawalAmount);
                break;

            case 4:
                System.out.println(" Thank you for using our service !");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
}

public class task3 {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Initial balance set to $1000
        ATM atm = new ATM(userAccount);

        while (true) {
            atm.displayMenu();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice (1-4):");
            int choice = sc.nextInt();

            atm.processOption(choice);
        }
    }
}

