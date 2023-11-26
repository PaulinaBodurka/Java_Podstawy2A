package Interrupt;

public class WatekSleepRunnable implements Runnable{
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("wątek sleep");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("poszedł exception w sleepie");
            return;
        }
    }

}
