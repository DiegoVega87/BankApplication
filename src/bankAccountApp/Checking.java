package bankAccountApp;

public class Checking extends Account{

    private int debitCardNumber;
    private int cardPin;



    public Checking(String name,  String SSN, double initialDeposit, String type) {
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
