class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount() {
        accountNumber = 0;
        accountHolderName = "Unknown";
        balance = 0;
    }

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
 class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(101, "Rahul", 25000);

        account2.deposit(5000);
        account2.withdraw(3000);

        account1.displayAccount();

        System.out.println();

        account2.displayAccount();
    }
}