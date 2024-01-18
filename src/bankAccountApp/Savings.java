package bankAccountApp;

import java.util.Random;

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
        Random random = new Random();

        safetyDepositBoxID = random.nextInt(100, 999);
        safetyDepositBoxKey = random.nextInt(1000, 9999);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nYour Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey;

    }
}
