package Zad3i4;

public class BalanceIncrementator extends BalanceModyficator implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            balance.increase(1);
        }
        try {
            Thread.sleep((1+ rand.nextInt(3))*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Koniec pracy inkrementatora");
    }
}
