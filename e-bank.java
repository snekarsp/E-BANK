import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolder, int accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to check account balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Getters for account details (optional)
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
public class EBankManagementSystem {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial account creation
        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();
        
        System.out.print("Enter initial deposit amount: $");
        double initialBalance = scanner.nextDouble();
        
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after reading account number

        // Create the bank account object
        BankAccount account = new BankAccount(accountHolder, accountNumber, initialBalance);

        // Main menu loop
        while (true) {
            // Display the menu
            System.out.println("\n--- E-Banking System ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Option to check the balance
                    account.checkBalance();
                    break;

                case 2:
                    // Option to deposit money
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    // Option to withdraw money
                    System.out.print("Enter withdraw amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    // Option to exit the program
                    System.out.println("Thank you for using the E-Banking system.");
                    scanner.close();
                    return;

                default:
                    // Invalid option
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}



