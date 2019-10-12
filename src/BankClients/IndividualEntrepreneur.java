package BankClients;

public class IndividualEntrepreneur extends Clients {


    public IndividualEntrepreneur(double paymentScore) {
        super(paymentScore);
    }



    @Override
    public void setCashIn(double amount) {
        double bankOnePercent = amount * 0.01;
        double bankHalfPercent = amount * 0.005;
        if (amount < 1000) {
            changeBalance(getBalance() + amount - bankOnePercent);
            System.out.println("Credited amount " + amount +
                    "\nBank percent = " + bankOnePercent + " Current balance = " + getBalance());
        }
        else if (amount >= 1000) {
            changeBalance(getBalance() + amount - bankHalfPercent);
            System.out.println("Credited amount " + amount +
                    "\nBank percent = " + bankHalfPercent + " Current balance = " + getBalance());
        }
    }

    @Override
    public void setCashOut(double amount) {
        if (getBalance() < amount) {
            System.out.println("Your current balance = " + getBalance() + ". You cannot withdraw " + amount);
        }
        else {
            changeBalance(getBalance() - amount);
            System.out.println("The amount " + amount + "  withdrawn from the account. Current balance = " + getBalance());
        }
    }

}
