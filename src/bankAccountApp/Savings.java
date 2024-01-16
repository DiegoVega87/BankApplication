package bankAccountApp;

public class Savings extends Account{

    private int safeDepositBoxID;
    private int SafeDepositBoxKey;
    public Savings(String name, String SSN, double initialDeposit) {
        super(name, SSN, initialDeposit);
    }

    @Override
    public boolean deposit(double amount) {
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }

    @Override
    public boolean transfer(String accountNumber, double amount) {
        return false;
    }
}
