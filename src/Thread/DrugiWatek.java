package Thread;

public class DrugiWatek extends Thread {
    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            System.out.println("moj drugi wątek: " + i);
        }
    }
}
