package BankClients;

public class Organization extends Clients {


    public Organization(double paymentScore) {
        super(paymentScore);
    }



    @Override
    public void cashToScore(double amount) {
        isCashIn = true;
        super.setCashIn(amount);
        printInfo(amount);
        isCashIn = false;
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
            super.setCashOut(amount * BANK_PERCENT_SIMPLE);
            isCashOut = false;
        }

    }

    @Override
    public void printInfo(double amount) {
        double bankPercent = amount * 0.01; // комиссия 1%
        if (isCashIn) {
            System.out.println("Entered amount " + amount + " Current balance = " + getBalance());
        }
        if (isCashOut) {
            System.out.println(getBalance() < amount ? "Your current balance = " + getBalance() + ". You cannot withdraw " + amount : "" +
                    "The amount " + amount + "  withdrawn from the account. Bank percent = " + bankPercent + " Current balance = " + (getBalance() - amount * BANK_PERCENT_SIMPLE));
        }
    }
}
