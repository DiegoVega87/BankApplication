package bankAccountApp;

public abstract class Account implements IBaseRate {

    private String name;
    private String SSN;
    private double balance;
    private String accountNumber;
    double rate;

    public Account(String name, String SSN, double initialDeposit) {
        this.name = name;
        this.SSN = SSN;
        balance = initialDeposit;

        System.out.println("Name: " + name + "\sSSN: " + SSN + "\sBalance: " + balance);
    }

    public abstract boolean desposit(double amount);
    public abstract boolean withdraw(double amount);

    public abstract boolean transfer(String accountNumber, double amount);
}
