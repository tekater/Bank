import Bank.BankAccount;
import Bank.CheckingAccount;
import Bank.SavingAccounts;

public class Main {
    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount("1234 4321 3232", 100000L,2.4);
        System.out.println(check);
        SavingAccounts save = new SavingAccounts("7700 1210 1110", 37281L, 5);
        System.out.println(save);
    }
}