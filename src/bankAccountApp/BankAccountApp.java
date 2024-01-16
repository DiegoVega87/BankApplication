package bankAccountApp;


public class BankAccountApp {

    public static void main(String[] args) {
        Checking chkcc1 = new Checking("Tom Wilson", "937184575", 1500);
        Savings savacc1 = new Savings("Rich Lowe", "456217852", 2500);
        System.out.println(chkcc1);
        System.out.println(savacc1);

        System.out.println("******Operations:**********");
        savacc1.deposit(5000);
        savacc1.withdraw(200);
        savacc1.transfer("Brokerage", 3000);

    }
}
