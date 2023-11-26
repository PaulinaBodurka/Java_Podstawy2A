package Thread_Zadania;

public class Czasoodmierzacz implements Runnable {
    @Override
    public void run() {
        int czas = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            czas++;
            System.out.println("Mineło" + czas + "sekund");
        }
    }
}
