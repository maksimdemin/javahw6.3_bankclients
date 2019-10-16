package BankClients;

public abstract class Clients {

    final double BANK_PERCENT_SIMPLE = 1.01; // (balance - amount - amount * 0.01) = balance - amount * 1.01
    final double BANK_ONE_PERCENT_SIMPLE = 0.99; // (balance + amount - amount * 0.01) = balance + amount * 0.99
    final double BANK_HALF_PERCENT_SIMPLE = 0.995; // (balance + amount - amount * 0.005) = balance + amount * 0.995
    boolean isCashIn = false; // перемeнная для метода printInfo
    boolean isCashOut = false; // перемeнная для метода printInfo

    private double paymentScore;

    Clients(double paymentScore) {
        this.paymentScore = paymentScore;
    }


    public abstract void cashToScore(double CashIn); // абстрактный метод для вввода средств на счет


    public abstract void cashFromScore(double CashOut); // абстрактный метод для вывода средств со счета


    void setCashIn(double CashIn) {
        paymentScore = paymentScore + CashIn;
    }

    void setCashOut(double CashOut) {
        paymentScore = paymentScore - CashOut;
    }


    public double getBalance() { // метод для запроса текущего баланса счета
        return paymentScore;
    }

    abstract void printInfo(double cash);

}
