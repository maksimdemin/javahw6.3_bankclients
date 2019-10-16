package BankClients;

public class Individual extends Clients{


    public Individual(double paymentScore) {
        super(paymentScore);
    }



    @Override
    public void cashToScore(double amount) {
        super.setCashIn(amount);
        System.out.println("Entered amount " + amount + " Current balance = " + getBalance());
    }

    @Override
    public void cashFromScore(double amount) {
        if (getBalance() < amount) {
            System.out.println("Your current balance = " + getBalance() + ". You cannot withdraw " + amount);
        }
        else {
            super.setCashOut(amount);
            System.out.println("The amount " + amount + "  withdrawn from the account. Current balance = " + getBalance());
        }
    }

}
