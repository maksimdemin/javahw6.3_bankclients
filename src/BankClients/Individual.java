package BankClients;

public class Individual extends Clients{


    public Individual(double paymentScore) {
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
            super.setCashOut(amount);
            isCashOut = false;
        }
    }

    @Override
    public void printInfo(double amount) {
        if (isCashIn) {
            System.out.println("Entered amount " + amount + " Current balance = " + getBalance());
        }
        if (isCashOut) {
            System.out.println(getBalance() < amount ? "Your current balance = " + getBalance() + ". You cannot withdraw " + amount : "" +
                    "The amount " + amount + "  withdrawn from the account. Current balance = " + (getBalance() - amount));

        }

    }

}
