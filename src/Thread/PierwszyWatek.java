package Thread;

public class PierwszyWatek extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            System.out.println("moj pierwszy wątek: " + i);
        }
    }
}
