class BankAccount {

    // Encapsulated attributes
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Getter method
    double getBalance() {
        return balance;
    }

    // Display method
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Rahul", 5000);

        account.display();

        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}