package Bank;

public class BankAccount {
protected String number;
protected long balance;
    public BankAccount(String number, long balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    @Override
    public String toString () {
        return "BankgAccount{" +
                "Number=" + number +
                ", Balance=" + balance +
                //", fee= " + fee +
                //", Interest Rate" + interestRate +
                '}';
    }
}
