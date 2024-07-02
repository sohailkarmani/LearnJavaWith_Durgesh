package Oops;
    // Define the SavingsAccount subclass that extends BankAccount
class SavingsAccount extends BankAccount {

    // Attribute for interest rate
    private double interestRate;

    // Constructor to initialize SavingsAccount object
    public SavingsAccount(int Acc_No,String acc_Holder,int balance, double interestRate) {
        super(Acc_No, acc_Holder, balance);
         // Call the constructor of the superclass
        this.interestRate = interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        double interest = checkBalance() * interestRate / 100; // Calculate interest
        deposit(interest); // Add interest to the balance
        System.out.println("Interest applied: " + interest + ". New balance: " + checkBalance());
    }

    // Getter method for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Setter method for interest rate
    public void setInterestRate(double interestRate) {
        if (interestRate > 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Interest rate must be positive.");
        }
    }
}


