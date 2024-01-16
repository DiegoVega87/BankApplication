package bankAccountApp;

public class Savings extends Account{

    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    public Savings(String name, String SSN, double initialDeposit) {
        super(name, SSN, initialDeposit);
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
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

    @Override
    public String toString() {
        return super.toString() +
                "\nYour Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey;

    }
}
