package bankAccountApp;

import java.util.Random;

public class Checking extends Account{

    private long debitCardNumber;
    private int cardPin;



    public Checking(String name,  String SSN, double initialDeposit) {
        super(name, SSN, initialDeposit);
        setDebitCard();
    }
    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }

    private void setDebitCard(){
        Random random = new Random();
        debitCardNumber = random.nextLong(100000000000L, 999999999999L);
        cardPin = random.nextInt(1000, 9999);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nYour Checking Account Features" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN: " + cardPin;
    }
}
