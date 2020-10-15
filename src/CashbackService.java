public class CashbackService {
    int regular(int expense, int percent) {
        int cashbackRegular = expense * percent / 100;
        return cashbackRegular;
    }

    int high (int expense, int percent) {
        int cashbackHigh = expense * percent / 100;
        return cashbackHigh;
    }

    int special (int expense, int percent) {
        int cashbackSpecial = expense * percent / 100;
        return cashbackSpecial;
    }

}
