package Zad3i4;

public class Balance {
    private int account = 0;

    synchronized public int getAccount() {
        return account;
    }

    synchronized public void increase(int val) {
        int temp = account;
        temp += val;
        account = temp;

    }

    synchronized public void decrease(int val) {
        int temp = account;
        temp -= val;
        account = temp;
    }
}

