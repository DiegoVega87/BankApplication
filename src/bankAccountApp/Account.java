package bankAccountApp;

public abstract class Account implements IBaseRate {

    private String firstName;
    private String lastName;
    private String SSN;
    private double initialDeposit;
    private String accountNumber;
    private String type;

    public Account(String firstName, String lastName, String SSN, double initialDeposit, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.initialDeposit = initialDeposit;
        this.type = type;
    }

    public abstract boolean desposit(double amount);
    public abstract boolean withdraw(double amount);

    public abstract boolean transfer(String accountNumber, double amount);
}
