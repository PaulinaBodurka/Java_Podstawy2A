package Interrupt;

public class WatekInterruptedRunnable implements Runnable{
    @Override
    public void run() {
        while(!Thread.interrupted()){
            System.out.println("Watek Interrupted działa");
        }
        System.out.println("Poza whilem i koniec");
    }
}
