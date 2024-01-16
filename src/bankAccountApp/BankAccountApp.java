package bankAccountApp;

import java.util.Random;

public class BankAccountApp {

    public static void main(String[] args) {
        Checking chkcc1 = new Checking("Tom Wilson", "937184575", 1500);
        Savings savacc1 = new Savings("Rich Lowe", "456217852", 2500);
        System.out.println(chkcc1);
        System.out.println(savacc1);

    }
}
