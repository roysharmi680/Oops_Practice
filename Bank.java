// Complete Inner Class Practice Program

interface Notification {
    void send();
}

abstract class Payment {
    abstract void pay(double amount);
}

class Bank {

    // Outer class members
    private String bankName = "ABC Bank";
    private String branch = "Habra";
    private int totalAccounts = 0;

    // =========================================================
    // 1. MEMBER INNER CLASS
    // =========================================================

    class Account {

        private int accountNo;
        private String holderName;
        private double balance;

        Account(int accountNo, String holderName, double balance) {
            this.accountNo = accountNo;
            this.holderName = holderName;
            this.balance = balance;
            totalAccounts++;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println(amount + " deposited.");
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(amount + " withdrawn.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        void displayAccount() {
            System.out.println("\n--- Account Details ---");
            System.out.println("Bank       : " + bankName);
            System.out.println("Branch     : " + branch);
            System.out.println("Account No : " + accountNo);
            System.out.println("Holder     : " + holderName);
            System.out.println("Balance    : " + balance);
        }

        // =====================================================
        // 2. INNER CLASS INSIDE INNER CLASS
        // =====================================================

        class Transaction {

            private int transactionId;
            private String type;
            private double amount;

            Transaction(int transactionId, String type, double amount) {
                this.transactionId = transactionId;
                this.type = type;
                this.amount = amount;
            }

            void displayTransaction() {
                System.out.println("\n--- Transaction ---");
                System.out.println("Transaction ID : " + transactionId);
                System.out.println("Type           : " + type);
                System.out.println("Amount         : " + amount);

                // Accessing Account class member
                System.out.println("Account Holder : " + holderName);

                // Accessing outer Bank class member
                System.out.println("Bank           : " + bankName);
            }
        }
    }

    // =========================================================
    // 3. STATIC NESTED CLASS
    // =========================================================

    static class BankInfo {

        static String country = "India";

        void display() {
            System.out.println("\n--- Bank Information ---");
            System.out.println("Country : " + country);

            // Static nested class cannot directly access
            // non-static Bank members.

            Bank bank = new Bank();

            System.out.println("Bank    : " + bank.bankName);
            System.out.println("Branch  : " + bank.branch);
        }
    }

    // =========================================================
    // 4. LOCAL INNER CLASS
    // =========================================================

    void calculateInterest(double balance) {

        double rate = 5.0;

        // Local Inner Class
        class InterestCalculator {

            void calculate() {
                double interest = balance * rate / 100;

                System.out.println("\n--- Interest Calculation ---");
                System.out.println("Balance  : " + balance);
                System.out.println("Rate     : " + rate + "%");
                System.out.println("Interest : " + interest);
            }
        }

        InterestCalculator obj = new InterestCalculator();

        obj.calculate();
    }

    // =========================================================
    // 5. ANONYMOUS INNER CLASS USING INTERFACE
    // =========================================================

    void sendNotification() {

        Notification notification = new Notification() {

            @Override
            public void send() {
                System.out.println("\nNotification sent successfully!");
            }
        };

        notification.send();
    }

    // =========================================================
    // 6. ANONYMOUS INNER CLASS USING ABSTRACT CLASS
    // =========================================================

    void makePayment() {

        Payment payment = new Payment() {

            @Override
            void pay(double amount) {
                System.out.println("\nPayment successful.");
                System.out.println("Amount paid: " + amount);
            }
        };

        payment.pay(2500);
    }

    // =========================================================
    // 7. THIS AND OuterClass.this
    // =========================================================

    void thisExample() {

        int totalAccounts = 100;

        class Example {

            int totalAccounts = 50;

            void show() {

                int totalAccounts = 10;

                System.out.println("\n--- this Example ---");

                // Local variable
                System.out.println("Local variable : "
                        + totalAccounts);

                // Inner class variable
                System.out.println("Inner variable : "
                        + this.totalAccounts);

                // Outer class variable
                System.out.println("Outer variable : "
                        + Bank.this.totalAccounts);
            }
        }

        Example e = new Example();

        e.show();
    }

    // =========================================================
    // 8. OUTER CLASS METHOD
    // =========================================================

    void displayBank() {

        System.out.println("\n--- Bank Details ---");
        System.out.println("Bank   : " + bankName);
        System.out.println("Branch : " + branch);
    }

    // =========================================================
    // MAIN METHOD
    // =========================================================

    public static void main(String[] args) {

        // -----------------------------------------------------
        // Creating Outer class object
        // -----------------------------------------------------

        Bank bank = new Bank();

        bank.displayBank();

        // -----------------------------------------------------
        // Creating Member Inner Class object
        // -----------------------------------------------------

        Bank.Account account =
                bank.new Account(101, "Rahul", 10000);

        account.displayAccount();

        // Deposit
        account.deposit(5000);

        // Withdraw
        account.withdraw(2000);

        account.displayAccount();

        // -----------------------------------------------------
        // Creating Inner class inside Inner class
        // -----------------------------------------------------

        Bank.Account.Transaction transaction =
                account.new Transaction(
                        5001,
                        "Deposit",
                        5000
                );

        transaction.displayTransaction();

        // -----------------------------------------------------
        // Creating Static Nested Class object
        // -----------------------------------------------------

        Bank.BankInfo info =
                new Bank.BankInfo();

        info.display();

        // -----------------------------------------------------
        // Local Inner Class
        // -----------------------------------------------------

        bank.calculateInterest(13000);

        // -----------------------------------------------------
        // Anonymous Inner Class - Interface
        // -----------------------------------------------------

        bank.sendNotification();

        // -----------------------------------------------------
        // Anonymous Inner Class - Abstract Class
        // -----------------------------------------------------

        bank.makePayment();

        // -----------------------------------------------------
        // this and Outer.this
        // -----------------------------------------------------

        bank.thisExample();

        // -----------------------------------------------------
        // Final result
        // -----------------------------------------------------

        System.out.println("\nTotal Accounts: "
                + bank.totalAccounts);
    }
}