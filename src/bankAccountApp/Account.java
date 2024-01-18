package bankAccountApp;

import java.sql.SQLOutput;
import java.util.Random;

public abstract class Account implements IBaseRate {

    private final String name;
    private double balance;
    private final String accountNumber;
    private static int digits = 10000;
    protected double rate;

    public Account(String name, String SSN, double initialDeposit) {
        this.name = name;
        balance = initialDeposit;

        //set account number
        accountNumber = setAccountNumber(this.getClass().getSimpleName(), SSN);
        setRate();

    }

    public abstract void setRate();
    private String setAccountNumber(String accountType, String SSN){

        // Get las two digits of SSN
        String lastTwoSSNDigits = SSN.substring(SSN.length()-2);
        // Generate a 3 digit random number
        Random random = new Random();
        int rDigits = random.nextInt(100, 900);
        // Set the first Digit according to the account type
        int firstDigit = accountType.equalsIgnoreCase("savings") ? 1 : 2;

        return firstDigit + lastTwoSSNDigits + digits++ + rDigits;

    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        System.out.println("Accrued Interest : $" + accruedInterest);
    }
    public boolean deposit(double amount){

        if(amount < 1){
            System.out.println("ERROR: Deposit must be >= $1 ");
        }else{
            System.out.println("Depositing $" + amount);
            balance += amount;
            System.out.println("Your balance is now: $" + getBalance());
        }
        return amount >= 1;
    }
    public boolean withdraw(double amount){

        if(amount < 1){
            System.out.println("ERROR: Withdrawal must be >= $1");
        }else if(amount > balance){
            System.out.println("Insufficient funds, your balance is: $" + balance);
        }else{
            System.out.println("Withdrawing $" + amount);
            balance -= amount;
            System.out.println("Your balance is now: $" + getBalance());
        }

        return (amount > 1 && amount < balance);
    }

    public boolean transfer(String recipientAccount, double amount){
        if(amount < 1){
            System.out.println("ERROR: Transfer must be >= $1");
        }else if(amount > balance){
            System.out.println("Insufficient funds, your balance is: $" + balance);
        }else{
            System.out.println("Transferring $" + amount + " to " + recipientAccount);
            balance -= amount;
            System.out.println("Your balance is now: $" + getBalance());
        }

        return (amount > 1 && amount < balance);
    }

    public double getBalance(){
        return balance;
    }
    @Override
    public String toString() {
        return  "\nName: " + name  +
                "\nAccount Number: " + accountNumber  +
                "\nBalance: $" + balance +
                "\nInterest Rate: " + rate + "%" +
                "\nAccount Type: " +  this.getClass().getSimpleName();
    }
}
