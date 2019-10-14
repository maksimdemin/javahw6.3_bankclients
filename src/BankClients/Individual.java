package BankClients;

public class Individual extends Clients{


    public Individual(double paymentScore) {
        super(paymentScore);
    }



    @Override
    public void setCashIn(double amount) {
        super.changeBalance(getBalance() + amount);
        System.out.println("Entered amount " + amount + " Current balance = " + getBalance());
    }

    @Override
    public void setCashOut(double amount) {
        if (getBalance() < amount) {
            System.out.println("Your current balance = " + getBalance() + ". You cannot withdraw " + amount);
        }
        else {
            super.changeBalance(getBalance() - amount);
            System.out.println("The amount " + amount + "  withdrawn from the account. Current balance = " + getBalance());
        }
    }

}
