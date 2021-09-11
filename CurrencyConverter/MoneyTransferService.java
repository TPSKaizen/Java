package CurrencyConverter;

public class MoneyTransferService {

    currencyConverter c1 = new currencyConverter();

    double computeTransferAmount(int index, double amount) {
        return c1.computeTransferAmount(index, amount);
    }

    double computeTransferFee(int index, double amount) {
        return computeTransferAmount(index, amount) * 0.02;
    }

    public static void main(String[] args) {
        MoneyTransferService m1 = new MoneyTransferService();

        System.out.println("Fee : " + m1.computeTransferFee(0, 1000));
    }
}
