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
        setAccountNumber(this.getClass().getSimpleName(), SSN);
        System.out.println(accountNumber);
    }

    private void setAccountNumber(String accountType, String SSN){

        String twoSSNDigits = SSN.substring(SSN.length()-2);
        Random random = new Random();
        int rDigits = random.nextInt(100, 900);
        int firstDigit = accountType.equalsIgnoreCase("savings") ? 1 : 2;

        accountNumber = firstDigit + twoSSNDigits + digits + rDigits;
    }
    public abstract boolean desposit(double amount);
    public abstract boolean withdraw(double amount);

    public abstract boolean transfer(String accountNumber, double amount);
}
