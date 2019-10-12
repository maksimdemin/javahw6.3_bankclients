package BankClients;

public abstract class Clients {

    private double paymentScore;

    public Clients(double paymentScore) {
        this.paymentScore = paymentScore;
    }


    public abstract void setCashIn(double CashIn); // абстрактный метод для вввода средств на счет


    public abstract void setCashOut(double CashOut); // абстрактный метод для вывода средств со счета


    void changeBalance(double paymentScore) { // метод для работы с переменной paymentScore в других классах
        this.paymentScore = paymentScore;
    }


    public double getBalance() { // метод для запроса текущего баланса счета
        return paymentScore;
    }
}
