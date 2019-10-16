package BankClients;

public class IndividualEntrepreneur extends Clients {


    public IndividualEntrepreneur(double paymentScore) {
        super(paymentScore);
    }


    @Override
    public void cashToScore(double amount) {
        if (amount < 1000) {
            isCashIn = true;
            super.setCashIn(amount * BANK_ONE_PERCENT_SIMPLE);
            printInfo(amount);
            isCashIn = false;
        }
        else if (amount >= 1000) {
            isCashIn = true;
            super.setCashIn(amount * BANK_HALF_PERCENT_SIMPLE);
            printInfo(amount);
            isCashIn = false;
        }
    }


    @Override
    public void cashFromScore(double amount) {
        if (getBalance() < amount) {
            isCashOut = true;
            printInfo(amount);
            isCashOut = false;
        }
        else {
            isCashOut = true;
            printInfo(amount);
            super.setCashOut(amount);
            isCashOut = false;
        }
    }


    @Override
    public void printInfo(double amount) {
        if (isCashIn) {
            double bankOnePercent = amount * 0.01; // комиссия 1%
            double bankHalfPercent = amount * 0.005; // комиссия 0.5%
            System.out.println(amount < 1000 ? "Entered amount " + amount +
                    "\nBank percent 1% = " + bankOnePercent + " Current balance = " + getBalance() : "Entered amount " + amount +
                    "\nBank percent 0.5% = " + bankHalfPercent + " Current balance = " + getBalance());
        }
        if (isCashOut) {
            System.out.println(getBalance() < amount ? "Your current balance = " + getBalance() + ". You cannot withdraw " + amount : "" +
                    "The amount " + amount + "  withdrawn from the account. Current balance = " + (getBalance() - amount));

        }
    }
}
