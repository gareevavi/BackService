public class Main {
    public static void main(String[] args) {
        DepositService serviceD = new DepositService();
        int deposit = serviceD.calculate(1000, 3);

        CashbackService serviceC = new CashbackService();
        int regular = serviceC.regular(1000,1);
        int high = serviceC.high(1000, 5);
        int special = serviceC.special(1000, 30);

        int cashback = regular + high + special;

        int cashbackLimit = 3000;
        if (cashback > cashbackLimit) {
            cashback = cashbackLimit;
        }

        System.out.println(deposit);
        System.out.println(cashback);


    }
}
