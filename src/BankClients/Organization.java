package BankClients;

public class Organization extends Clients {


    public Organization(double paymentScore) {
        super(paymentScore);
    }



    @Override
    public void cashToScore(double amount) {
        setCashIn(amount);
        System.out.println("Entered amount " + amount + " Current balance = " + getBalance());
    }

    @Override
    public void cashFromScore(double amount) {
        double bankPercent = amount * 0.01; // комиссия 1%
        double bankPercentSimple = 1.01; // (balance - amount - amount * 0.01) = balance - amount * 1.01
        if (getBalance() < amount) {
            System.out.println("Your current balance = " + getBalance() + ". You cannot withdraw " + amount);
        }
        else {
            setCashOut(amount * bankPercentSimple);
            System.out.println("The amount " + amount + "  withdrawn from the account. Bank percent = " + bankPercent + " Current balance = " + getBalance());
        }

    }
}
