package Interrupt;

public class MainWatekInterrupt {
    public static void main(String[] args) throws InterruptedException {
        //sleep
        Thread watekSleepThread = new Thread(new WatekSleepRunnable());
        watekSleepThread.start();
        watekSleepThread.interrupt();

        //interrupted
        Thread watekInterruptedThread = new Thread(new WatekInterruptedRunnable());
        watekInterruptedThread.start();

        Thread.sleep(1000);
        watekInterruptedThread.interrupt();

        //flaga
        WatekFlagaRunnable watekFlagaRunnable = new WatekFlagaRunnable();
        Thread watekFlagaThread = new Thread(watekFlagaRunnable);
        watekFlagaThread.start();
        Thread.sleep(1000);
        watekFlagaRunnable.zatrzymajWatek();


    }
}
