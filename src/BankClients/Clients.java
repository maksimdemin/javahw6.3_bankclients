package BankClients;

public abstract class Clients {

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

//    public abstract void printInfo(double cash);

}
