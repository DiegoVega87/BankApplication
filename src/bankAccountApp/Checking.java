package bankAccountApp;

public class Checking extends Account{

    private int debitCardNumber;
    private int cardPin;



    public Checking(String name,  String SSN, double initialDeposit) {
        super(name, SSN, initialDeposit);
        setDebitCard();
    }

    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        cardPin = (int)(Math.random() * Math.pow(10,4));
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
        return  super.toString() +
                "\nYour Checking Account Features" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN: " + cardPin;
    }
}
