package bankAccountApp;

import java.util.Random;

public abstract class Account implements IBaseRate {

    private final String name;
    private final double balance;
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
    public abstract boolean deposit(double amount);
    public abstract boolean withdraw(double amount);

    public abstract boolean transfer(String accountNumber, double amount);

    @Override
    public String toString() {
        return  "\nName: " + name  +
                "\nAccount Number: " + accountNumber  +
                "\nBalance: $" + balance +
                "\nInterest Rate: " + rate + "%" +
                "\nAccount Type: " +  this.getClass().getSimpleName();
    }
}
