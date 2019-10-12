package BankClients;

public class Organization extends Clients {


    public Organization(double paymentScore) {
        super(paymentScore);
    }



    @Override
    public void setCashIn(double amount) {
        changeBalance(getBalance() + amount);
        System.out.println("Credited amount " + amount + " Current balance = " + getBalance());
    }

    @Override
    public void setCashOut(double amount) {
        double bankPercent = amount * 0.01;
        if (getBalance() < amount) {
            System.out.println("Your current balance = " + getBalance() + ". You cannot withdraw " + amount);
        }
        else {
            changeBalance(getBalance() - amount - bankPercent);
            System.out.println("The amount " + amount + "  withdrawn from the account. " +
                    "\nBank percent = " + bankPercent + " Current balance = " + getBalance());
        }

    }
}
