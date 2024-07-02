/*Write a Java program to create a class called "BankAccount"
 with attributes for account number, account holder's name, and balance. 
 Include methods for depositing and withdrawing money, as well as checking the balance.
Create a subclass called "SavingsAccount" that adds an interest rate attribute
 and a method to apply interest.*/
package Oops;

import java.util.Scanner;

public class BankAccount {
    int Acc_No;
    String acc_Holder;
    int balance;
    public BankAccount(int Acc_No,String acc_Holder,int balance){
        this.Acc_No=Acc_No;
        this.acc_Holder=acc_Holder;
        this.balance=balance;

    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit: "+amount+"  .New Balance :"+balance);

        }
        else{
            System.out.println("Deposit amount must be positive ");
        }

    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw :"+amount+"  .New Balamce "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }

    }
    public double checkBalance(){
         return balance;
    }



    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account No :");
        int Acc_No=sc.nextInt();
        System.out.print("Enter Account holder name :");
        String acc_Holder=sc.next();
        System.out.print("Enter balance :");
        int balance=sc.nextInt();
        BankAccount bank=new BankAccount(Acc_No, acc_Holder, balance);
        bank.deposit(300);
        bank.withdraw(200);
        bank.checkBalance();



        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount(Acc_No, acc_Holder, balance, balance);
        savings.applyInterest(); // Apply interest
        System.out.println("Savings account balance: " + savings.checkBalance()); // Check balance
        
        
    }

}
