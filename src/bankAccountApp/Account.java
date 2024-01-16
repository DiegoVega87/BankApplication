package bankAccountApp;

import java.util.Random;

public abstract class Account implements IBaseRate {

    private String name;
    private String SSN;
    private double balance;
    private String accountNumber;
    private static int digits = 10000;
    double rate;

    public Account(String name, String SSN, double initialDeposit) {
        this.name = name;
        this.SSN = SSN;
        balance = initialDeposit;

        System.out.println("Name: " + name + "\sSSN: " + SSN + "\sBalance: " + balance);

        //set account number
        accountNumber = setAccountNumber(this.getClass().getSimpleName(), SSN);

        System.out.println("Account Number: " +accountNumber);
    }

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
}
