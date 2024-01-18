package bankAccountApp;


import utilities.CSV;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        /*
        Checking chkcc1 = new Checking("Tom Wilson", "937184575", 1500);
        Savings savacc1 = new Savings("Rich Lowe", "456217852", 2500);

        savacc1.compound();

        System.out.println(savacc1);
        System.out.println(chkcc1);

         */


        List<Account> accounts = new ArrayList<>();


        System.out.println("******Importing Accounts:**********");
        // Read a CSV file then create new accounts based on that data
        CSV.read("NewBankAccounts.csv").forEach(data -> {
            String name = data[0];
            String SSN = data[1];
            String accountType = data[2];
            int initialDeposit = Integer.parseInt(data[3]);

            Account ac;
            ac = accountType.equalsIgnoreCase("Checking") ? new Checking(name,SSN,initialDeposit) :
                    new Savings(name,SSN,initialDeposit); // ternary operator

            accounts.add(ac); // add to the list
        });

        for(Account ac : accounts){
            System.out.println("\n**********");
            System.out.println(ac);
        }
    }
}
