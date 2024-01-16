package bankAccountApp;

public class Savings extends Account{

    private int safeDepositBoxID;
    private int SafeDepositBoxKey;
    public Savings(String name, String SSN, double initialDeposit, String type) {
        super(name, SSN, initialDeposit, type);
    }

    @Override
    public boolean desposit(double amount) {
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
