package BankClients;

public class IndividualEntrepreneur extends Clients {


    public IndividualEntrepreneur(double paymentScore) {
        super(paymentScore);
    }



    @Override
    public void cashToScore(double amount) {
        double bankOnePercent = amount * 0.01; // комиссия 1%
        double bankOnePercentSimple = 0.99; // (balance + amount - amount * 0.01) = balance + amount * 0.99
        double bankHalfPercent = amount * 0.005; // комиссия 0.5%
        double bankHalfPercentSimple = 0.995; // (balance + amount - amount * 0.005) = balance + amount * 0.995
        if (amount < 1000) {
            super.setCashIn(amount * bankOnePercentSimple);
        }
        else if (amount >= 1000) {
            super.setCashIn(amount * bankHalfPercentSimple);
        }
        System.out.println(amount < 1000 ? "Entered amount " + amount +
                "\nBank percent 1% = " + bankOnePercent + " Current balance = " + getBalance() : "Entered amount " + amount +
                "\nBank percent 0.5% = " + bankHalfPercent + " Current balance = " + getBalance());
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
