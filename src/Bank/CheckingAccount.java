package Bank;

public class CheckingAccount extends BankAccount{
    protected double fee;
    public CheckingAccount(String number,long balance, double fee) {
        super(number,balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString () {
        return "CheckingAccount{" +
                "Number=" + number +
                ", Balance=" + balance +
                ", fee=" + fee +
                '}';
    }
}
