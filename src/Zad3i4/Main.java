package Zad3i4;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    /* Stwórz klasę Balance  która dodaje I odejmuję kwotę na koncie. Stwórz klasę BalanceTest ,
    która testuje wywoływanie kilku wątków na raz. Popraw kod używając synchronized.*/
    public static void main(String[] args) {

        Balance balance = new Balance();
       ExecutorService executor = Executors.newFixedThreadPool(2);
        BalanceIncrementator balanceIncrementator1 = new BalanceIncrementator();
        balanceIncrementator1.setBalance(balance);

        BalanceIncrementator balanceIncrementator2 = new BalanceIncrementator();
        balanceIncrementator2.setBalance(balance);

        executor.execute(balanceIncrementator1);
        executor.execute(balanceIncrementator2);

        executor.shutdown();

        try {
            executor.awaitTermination(10, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



//        Thread t1 = new Thread(balanceIncrementator1);
//        Thread t2 = new Thread(balanceIncrementator2);
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println(balance.getAccount());
    }
}
