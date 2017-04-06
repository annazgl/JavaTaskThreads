package Zad2;

public class Timer implements Runnable {

    private static final int LIM = 15;

    @Override
    public void run() {
        int seconds = 0;

        while(true){
            if(seconds == LIM){
                System.out.println("Czas się skończył");
                System.exit(0);
            }
            seconds++;
            try{
                Thread.sleep(1000);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }

    }
}
