package btvn;

public class App {
    public static void main(String[] args) {
        Account tk1 = new Account(1234, "NGUYEN HONG NGOC", 150000);
        System.out.println(tk1);
        SavingAccount tk2 = new SavingAccount(9876,"NGUYEN VAN A",200000,6);
       // int accountNo, String customerName, float balance,  int period);
        System.out.println(tk2);
        tk2.checkInterest();
        PerSonAccount tk3 = new PerSonAccount(4567,"NGUYEN VAN B",200000,10000);
        System.out.println(tk3);
        tk3.withDraw(50000);
        tk3.deposit(100000);
    }
}
