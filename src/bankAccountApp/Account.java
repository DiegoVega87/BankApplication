package bankAccountApp;

public abstract class Account implements IBaseRate {

    private String name;
    private String SSN;
    private double balance;
    private double initialDeposit;
    private String accountNumber;
    double rate;
    private String type;

    public Account(String name, String SSN, double initialDeposit, String type) {
        this.name = name;
        this.SSN = SSN;
        this.initialDeposit = initialDeposit;
        this.type = type;
    }

    public abstract boolean desposit(double amount);
    public abstract boolean withdraw(double amount);

    public abstract boolean transfer(String accountNumber, double amount);
}
