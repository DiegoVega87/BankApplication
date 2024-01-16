package bankAccountApp;

public class Checking extends Account{


    public Checking(String firstName, String lastName, String SSN, double initialDeposit, String type) {
        super(firstName, lastName, SSN, initialDeposit, type);
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
