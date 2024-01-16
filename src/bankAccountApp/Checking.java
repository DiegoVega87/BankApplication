package bankAccountApp;

public class Checking extends Account{

    private int debitCardNumber;
    private int cardPin;



    public Checking(String name,  String SSN, double initialDeposit) {
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
