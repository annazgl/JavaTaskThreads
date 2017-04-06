package Zad1;

public class Timer extends Thread {

    /*Stwórz klasę Timer dziedziczącą po Thread. Na konsoli powinno być możliwe pokazywanie liczby odmierzanej
    minut i sekund.*/

    private int sec = 0;
    private int min = 0;

    public void run() {
        while (true) {
            sec++;
            if(sec == 60){
                min++;
                sec = 0;
            }
            System.out.println(min + ":" + sec);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

            Thread timer = new Timer();
            timer.start();
        }
    }
