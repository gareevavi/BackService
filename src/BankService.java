public class BankService {
    int deposit(int sum, int percent) {
        int calcDeposit = sum * percent / 100;
        return calcDeposit;
    }

    int cashback(int regExpense, int highExpense, int specExpense, int regPercent, int highPercent, int specPercent) {
        int calcCashback = (regExpense * regPercent / 100) + (highExpense * highPercent / 100) + (specExpense * specPercent / 100);
        return calcCashback;
    }
}

