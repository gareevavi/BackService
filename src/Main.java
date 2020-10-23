public class Main {
    public static void main(String[] args) {
        BankService service = new BankService();
        int deposit = service.deposit (1000, 3);

        int cashback = service.cashback (
                1_000,
                1_000,
                1_000,
                1,
                5,
                30);

        int cashbackLimit = 3_000;
        if (cashback > cashbackLimit) {
            cashback = cashbackLimit;
        }

        System.out.println(deposit);
        System.out.println(cashback);
    }
}
