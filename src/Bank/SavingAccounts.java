package Bank;

public class SavingAccounts extends BankAccount{
    protected double interestRate;
    public SavingAccounts(String number, long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString () {
        return "CheckingAccount{" +
                "Number=" + number +
                ", Balance=" + balance +
                ", Interest Rate=" + interestRate +
                '}';
    }
}
