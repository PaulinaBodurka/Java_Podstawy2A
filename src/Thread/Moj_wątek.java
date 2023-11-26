package Thread;

public class Moj_wątek implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("nowy wątek: "+ i);
        }
    }
}
