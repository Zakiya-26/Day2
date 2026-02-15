package leetcode;

import java.util.Scanner;
import java.util.ArrayList;

class BankAccounts {
    String name;
    double balance;

    BankAccounts(String n, double initialBalance) {
        name = n;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. Current balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Current balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println(name + "'s Current balance: " + balance);
    }
}


public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccounts> accounts = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n==== Bank Menu ====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    accounts.add(new BankAccounts(name, balance));
                    System.out.println("Account created successfully for " + name + "!");
                    break;

                case 2:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts found. Create an account first.");
                        break;
                    }
                    System.out.print("Enter account number (1 to " + accounts.size() + "): ");
                    int depAcc = sc.nextInt() - 1;
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = sc.nextDouble();
                    accounts.get(depAcc).deposit(depAmount);
                    break;

                case 3:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts found. Create an account first.");
                        break;
                    }
                    System.out.print("Enter account number (1 to " + accounts.size() + "): ");
                    int wAcc = sc.nextInt() - 1;
                    System.out.print("Enter amount to withdraw: ");
                    double wAmount = sc.nextDouble();
                    accounts.get(wAcc).withdraw(wAmount);
                    break;

                case 4:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts found. Create an account first.");
                        break;
                    }
                    System.out.print("Enter account number (1 to " + accounts.size() + "): ");
                    int cAcc = sc.nextInt() - 1;
                    accounts.get(cAcc).checkBalance();
                    break;

                case 5:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts created yet.");
                        break;
                    }
                    System.out.println("\n=== List of Accounts ===");
                    for (int i = 0; i < accounts.size(); i++) {
                        System.out.println((i + 1) + ". " + accounts.get(i).name + " - Balance: " + accounts.get(i).balance);
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the bank app!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 6);

        sc.close();
    }
}
